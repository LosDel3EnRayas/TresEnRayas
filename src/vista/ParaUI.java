package vista;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.GestionDatos;
import control.Mybutton;
import control.TipoCasilla;

public class ParaUI extends UI {

	private ActionListener action;
	private GestionDatos gestion;
	private TipoCasilla tipos;

	public ParaUI() {
		super();
		gestion = new GestionDatos();
		tipos = new TipoCasilla();
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
				 
				
				boolean valido = gestion.jugarPosicion(button.getCoordenada(), gestion.verTurno());
				if(valido) {
					gestion.incrementarTurno();
					button.setText(tipos.getTipo(gestion.verTurno()));					
				}
				System.out.println("La posicion es :" + valido);
				
				
			}
			
		};
	}

}
