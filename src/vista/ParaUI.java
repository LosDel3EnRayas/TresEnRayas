package vista;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import control.GestionDatos;
import control.Mybutton;

public class ParaUI extends UI {

	private ActionListener action;
	private GestionDatos gestion;

	public ParaUI() {
		super();
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
		
		/* CREANDO EVENTOS */
		
		this.action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Mybutton button = (Mybutton)e.getSource();
				System.out.println(button.getCoordenada());
			}
			
		};
	}

}
