package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.GestionDatos;
import control.Juego;
import control.Mybutton;
import control.TipoCasilla;

public class ParaUI extends UI {

	private ActionListener action;
	private GestionDatos gestion;
	private TipoCasilla tipos;
	private Juego juego;

	public ParaUI() {
		super();
		gestion = new GestionDatos();
		tipos = new TipoCasilla();
		juego = new Juego();
		this.createEvent();
		this.addEvents();
	}
	
	private void addEvents() {
		
		/* AÑADIENDO EVENTOS A LOS BOTONES */
		
		Component[] componentes = this.panel.getComponents();
		for(Component componente : componentes) {
			((Mybutton)componente).addActionListener(action);
		}
		
	}
	
	private void createEvent(){
		
		/* CREANDO EVENTO PARA LOS BOTONES */
		
		this.action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Mybutton button = (Mybutton)e.getSource();
				System.out.println(button.getCoordenada());
				/* EVENT LISTENER DEL BOTON SI NO HAY QUE MOVER */
				if(!juego.getMover()) {
					/* Jugamos la posicion clicada */
					boolean valido = gestion.comprobarJugada(button.getCoordenada(), gestion.verTurno());
					if(valido) { /* Si es valida juega*/
						button.setText(tipos.getTipo(gestion.verTurno()));					
						gestion.incrementarTurno();
					}	
				}
				/* EVENT LISTENER DEL BOTON SI HAY QUE MOVER */
				if(juego.getMover()) {
					String casillaSeleccionada = gestion.getCasilla(button.getCoordenada());
					String turnoActual = tipos.getTipo(gestion.verTurno());
					/*Si no existe un boton anteriormente pulsado*/
					if(!juego.existsBotonAnterior()) {
						/*Comprobamos que la casilla es suya*/
						if (casillaSeleccionada == turnoActual &&
							gestion.comprobarBloqueos(button.getCoordenada())) {

								button.setText("");
								gestion.jugarPosicion(button.getCoordenada(), 0);
								setBotonAnterior(button);
						}
					}
					/*Si existe un boton anteriormente pulsado*/
					if(juego.existsBotonAnterior()) {
						Mybutton botonAnterior = juego.getBotonAnterior();
						/*Comprobamos que la posicion a jugar es valida, viendo:
						 * - Que no sea el mismo boton
						 * - Que la casilla este libre (gestion)
						 * - Que sea contigua (gestion)
						 * */
						if (button.getCoordenada() != botonAnterior.getCoordenada() &&
							gestion.comprobarPosicionValida(botonAnterior.getCoordenada(), button.getCoordenada())) {
							
							gestion.jugarPosicion(button.getCoordenada(), gestion.verTurno());
							button.setText(tipos.getTipo(gestion.verTurno()));
							juego.setExistsBotonAnterior(false);
							gestion.incrementarTurno();
							System.out.println("Turno de:" + tipos.getTipo(gestion.verTurno()));
						}
					}
					
				}
				/* Cambiamos a mover si hay 6 piezas colocadas*/
				if(gestion.getTurno() > 6) { 
					juego.setMover(true);
				}
				/* COMPROBAMOS VICTORIA, SI HAY, DESACTIVAMOS BOTONES*/
				if(gestion.comprobarVictoria()) { 
					/*Se incrementa el turno, para igualarlo a la ultima jugada*/
					gestion.incrementarTurno();
					desactivarBotones();
					mostrarVictoria();
				}
			}
			
		};
	}
	
	private void desactivarBotones() {
		Component[] botonera = this.panel.getComponents();
		for(Component boton : botonera) {
			boton.setEnabled(false);
			if(((Mybutton) boton).getText() == tipos.getTipo(gestion.verTurno())) {
				boton.setBackground(new Color(190,220,140));
			}
		}
		
	}
	
	private void mostrarVictoria() {
		this.winLabel.setText(String.format("Juego terminado, ganan l@s '%s'",tipos.getTipo(gestion.verTurno())));
	}
	
	private void setBotonAnterior(Mybutton button) {
		juego.setBotonAnterior(button);
		juego.setExistsBotonAnterior(true);
	}

}
