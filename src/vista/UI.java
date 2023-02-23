package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Coordenada;
import control.Juego;
import control.Mybutton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JPanel panel;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Mybutton button = new Mybutton(i+":"+j);
				panel.add(button);
			}
		}
		
		JLabel lblTitle = new JLabel("Tres En Raya!!!!!!");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("HAS GANADO!!!!!!!!!!!!!!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}
}
