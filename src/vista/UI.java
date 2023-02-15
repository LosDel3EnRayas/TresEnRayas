package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

public class UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


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
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_1_1 = new JButton("New button");
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("New button");
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("New button");
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("New button");
		panel.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("New button");
		panel.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1_1_2_2 = new JButton("New button");
		panel.add(btnNewButton_1_1_2_2);
		
		JLabel lblNewLabel = new JLabel("Tres En Raya!!!!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("HAS GANADO!!!!!!!!!!!!!!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}
}
