package ProyectoFinal.Teatro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;

public class Teatro2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teatro2 frame = new Teatro2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teatro2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel areaPreferencial = new JLabel("Area Preferencial");
		areaPreferencial.setBounds(350, 138, 83, 14);
		contentPane.add(areaPreferencial);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 163, 761, 2);
		contentPane.add(separator);
		
		Panel panelPreferencial_1 = new Panel();
		panelPreferencial_1.setBackground(Color.ORANGE);
		panelPreferencial_1.setBounds(83, 171, 34, 31);
		contentPane.add(panelPreferencial_1);
		panelPreferencial_1.setLayout(new SpringLayout());
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 208, 761, 2);
		contentPane.add(separator_1);
		
		Panel panelPreferencial_2 = new Panel();
		panelPreferencial_2.setBackground(Color.ORANGE);
		panelPreferencial_2.setBounds(123, 171, 34, 31);
		contentPane.add(panelPreferencial_2);
		panelPreferencial_2.setLayout(new SpringLayout());
		
		Panel panelPreferencial_3 = new Panel();
		panelPreferencial_3.setBackground(Color.ORANGE);
		panelPreferencial_3.setBounds(213, 171, 34, 31);
		contentPane.add(panelPreferencial_3);
		panelPreferencial_3.setLayout(new SpringLayout());
		
		Panel panelPreferencial_4 = new Panel();
		panelPreferencial_4.setBackground(Color.ORANGE);
		panelPreferencial_4.setBounds(253, 171, 34, 31);
		contentPane.add(panelPreferencial_4);
		panelPreferencial_4.setLayout(new SpringLayout());
		
		Panel panelPreferencial_5 = new Panel();
		panelPreferencial_5.setBackground(Color.ORANGE);
		panelPreferencial_5.setBounds(343, 171, 34, 31);
		contentPane.add(panelPreferencial_5);
		panelPreferencial_5.setLayout(new SpringLayout());
		
		Panel panelPreferencial_6 = new Panel();
		panelPreferencial_6.setBackground(Color.ORANGE);
		panelPreferencial_6.setBounds(383, 171, 34, 31);
		contentPane.add(panelPreferencial_6);
		panelPreferencial_6.setLayout(new SpringLayout());
		
		Panel panelPreferencial_7 = new Panel();
		panelPreferencial_7.setBackground(Color.ORANGE);
		panelPreferencial_7.setBounds(473, 171, 34, 31);
		contentPane.add(panelPreferencial_7);
		panelPreferencial_7.setLayout(new SpringLayout());
		
		Panel panelPreferencial_8 = new Panel();
		panelPreferencial_8.setBackground(Color.ORANGE);
		panelPreferencial_8.setBounds(513, 171, 34, 31);
		contentPane.add(panelPreferencial_8);
		panelPreferencial_8.setLayout(new SpringLayout());
		
		Panel panelPreferencial_9 = new Panel();
		panelPreferencial_9.setBackground(Color.ORANGE);
		panelPreferencial_9.setBounds(603, 171, 34, 31);
		contentPane.add(panelPreferencial_9);
		panelPreferencial_9.setLayout(new SpringLayout());
		
		Panel panelPreferencial_10 = new Panel();
		panelPreferencial_10.setBackground(Color.ORANGE);
		panelPreferencial_10.setBounds(643, 171, 34, 31);
		contentPane.add(panelPreferencial_10);
		panelPreferencial_10.setLayout(new SpringLayout());
		
		JLabel lblGraderiaPreferencial = new JLabel("Graderia Preferencial");
		lblGraderiaPreferencial.setBounds(350, 245, 109, 14);
		contentPane.add(lblGraderiaPreferencial);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 270, 761, 2);
		contentPane.add(separator_1_1);
		
		Panel panelGraderia_1 = new Panel();
		panelGraderia_1.setBackground(Color.YELLOW);
		panelGraderia_1.setBounds(133, 278, 34, 31);
		contentPane.add(panelGraderia_1);
		panelGraderia_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_2 = new Panel();
		panelGraderia_2.setBackground(Color.YELLOW);
		panelGraderia_2.setBounds(173, 278, 34, 31);
		contentPane.add(panelGraderia_2);
		panelGraderia_2.setLayout(new SpringLayout());
		
		Panel panelGraderia_6 = new Panel();
		panelGraderia_6.setBackground(Color.YELLOW);
		panelGraderia_6.setBounds(133, 315, 34, 31);
		contentPane.add(panelGraderia_6);
		panelGraderia_6.setLayout(new SpringLayout());
		
		Panel panelGraderia_7 = new Panel();
		panelGraderia_7.setBackground(Color.YELLOW);
		panelGraderia_7.setBounds(173, 315, 34, 31);
		contentPane.add(panelGraderia_7);
		panelGraderia_7.setLayout(new SpringLayout());
		
		Panel panelGraderia_3 = new Panel();
		panelGraderia_3.setBackground(Color.YELLOW);
		panelGraderia_3.setBounds(213, 278, 34, 31);
		contentPane.add(panelGraderia_3);
		panelGraderia_3.setLayout(new SpringLayout());
		
		Panel panelGraderia_4 = new Panel();
		panelGraderia_4.setBackground(Color.YELLOW);
		panelGraderia_4.setBounds(253, 278, 34, 31);
		contentPane.add(panelGraderia_4);
		panelGraderia_4.setLayout(new SpringLayout());
		
		Panel panelGraderia_8 = new Panel();
		panelGraderia_8.setBackground(Color.YELLOW);
		panelGraderia_8.setBounds(213, 315, 34, 31);
		contentPane.add(panelGraderia_8);
		panelGraderia_8.setLayout(new SpringLayout());
		
		Panel panelGraderia_9 = new Panel();
		panelGraderia_9.setBackground(Color.YELLOW);
		panelGraderia_9.setBounds(253, 315, 34, 31);
		contentPane.add(panelGraderia_9);
		panelGraderia_9.setLayout(new SpringLayout());
		
		Panel panelGraderia_5 = new Panel();
		panelGraderia_5.setBackground(Color.YELLOW);
		panelGraderia_5.setBounds(293, 278, 34, 31);
		contentPane.add(panelGraderia_5);
		panelGraderia_5.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_2 = new Panel();
		panelGraderia_1_1_2.setBackground(Color.YELLOW);
		panelGraderia_1_1_2.setBounds(253, 389, 34, 31);
		contentPane.add(panelGraderia_1_1_2);
		panelGraderia_1_1_2.setLayout(new SpringLayout());
		
		Panel panelGraderia_10 = new Panel();
		panelGraderia_10.setBackground(Color.YELLOW);
		panelGraderia_10.setBounds(293, 315, 34, 31);
		contentPane.add(panelGraderia_10);
		panelGraderia_10.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_2 = new Panel();
		panelGraderia_1_3_2.setBackground(Color.YELLOW);
		panelGraderia_1_3_2.setBounds(133, 426, 34, 31);
		contentPane.add(panelGraderia_1_3_2);
		panelGraderia_1_3_2.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_6 = new Panel();
		panelGraderia_1_6.setBackground(Color.YELLOW);
		panelGraderia_1_6.setBounds(293, 389, 34, 31);
		contentPane.add(panelGraderia_1_6);
		panelGraderia_1_6.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_3 = new Panel();
		panelGraderia_1_1_3.setBackground(Color.YELLOW);
		panelGraderia_1_1_3.setBounds(253, 426, 34, 31);
		contentPane.add(panelGraderia_1_1_3);
		panelGraderia_1_1_3.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_3 = new Panel();
		panelGraderia_1_2_3.setBackground(Color.YELLOW);
		panelGraderia_1_2_3.setBounds(173, 426, 34, 31);
		contentPane.add(panelGraderia_1_2_3);
		panelGraderia_1_2_3.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_3 = new Panel();
		panelGraderia_1_3_3.setBackground(Color.YELLOW);
		panelGraderia_1_3_3.setBounds(213, 426, 34, 31);
		contentPane.add(panelGraderia_1_3_3);
		panelGraderia_1_3_3.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_7 = new Panel();
		panelGraderia_1_7.setBackground(Color.YELLOW);
		panelGraderia_1_7.setBounds(173, 389, 34, 31);
		contentPane.add(panelGraderia_1_7);
		panelGraderia_1_7.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_4 = new Panel();
		panelGraderia_1_1_4.setBackground(Color.YELLOW);
		panelGraderia_1_1_4.setBounds(213, 389, 34, 31);
		contentPane.add(panelGraderia_1_1_4);
		panelGraderia_1_1_4.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_4 = new Panel();
		panelGraderia_1_2_4.setBackground(Color.YELLOW);
		panelGraderia_1_2_4.setBounds(293, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_4);
		panelGraderia_1_2_4.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_4 = new Panel();
		panelGraderia_1_3_4.setBackground(Color.YELLOW);
		panelGraderia_1_3_4.setBounds(133, 389, 34, 31);
		contentPane.add(panelGraderia_1_3_4);
		panelGraderia_1_3_4.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5 = new Panel();
		panelGraderia_1_2_5.setBackground(Color.YELLOW);
		panelGraderia_1_2_5.setBounds(173, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5);
		panelGraderia_1_2_5.setLayout(new SpringLayout());
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 475, 761, 2);
		contentPane.add(separator_1_1_1);
		
		Panel panelGraderia_1_2_5_1 = new Panel();
		panelGraderia_1_2_5_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_1.setBounds(213, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_1);
		panelGraderia_1_2_5_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_2 = new Panel();
		panelGraderia_1_2_5_2.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_2.setBounds(133, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_2);
		panelGraderia_1_2_5_2.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_3 = new Panel();
		panelGraderia_1_2_5_3.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_3.setBounds(253, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_3);
		panelGraderia_1_2_5_3.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_4 = new Panel();
		panelGraderia_1_2_5_4.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_4.setBounds(293, 426, 34, 31);
		contentPane.add(panelGraderia_1_2_5_4);
		panelGraderia_1_2_5_4.setLayout(new SpringLayout());
		
		JLabel lblPasillo = new JLabel("Pasillo");
		lblPasillo.setBounds(380, 315, 40, 14);
		contentPane.add(lblPasillo);
		
		Panel panelGraderia_1_8 = new Panel();
		panelGraderia_1_8.setBackground(Color.YELLOW);
		panelGraderia_1_8.setBounds(462, 278, 34, 31);
		contentPane.add(panelGraderia_1_8);
		panelGraderia_1_8.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_5 = new Panel();
		panelGraderia_1_1_5.setBackground(Color.YELLOW);
		panelGraderia_1_1_5.setBounds(502, 278, 34, 31);
		contentPane.add(panelGraderia_1_1_5);
		panelGraderia_1_1_5.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_4_1 = new Panel();
		panelGraderia_1_4_1.setBackground(Color.YELLOW);
		panelGraderia_1_4_1.setBounds(542, 278, 34, 31);
		contentPane.add(panelGraderia_1_4_1);
		panelGraderia_1_4_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_1_1 = new Panel();
		panelGraderia_1_1_1_1.setBackground(Color.YELLOW);
		panelGraderia_1_1_1_1.setBounds(582, 278, 34, 31);
		contentPane.add(panelGraderia_1_1_1_1);
		panelGraderia_1_1_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_5_1 = new Panel();
		panelGraderia_1_5_1.setBackground(Color.YELLOW);
		panelGraderia_1_5_1.setBounds(622, 278, 34, 31);
		contentPane.add(panelGraderia_1_5_1);
		panelGraderia_1_5_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_6 = new Panel();
		panelGraderia_1_2_6.setBackground(Color.YELLOW);
		panelGraderia_1_2_6.setBounds(462, 315, 34, 31);
		contentPane.add(panelGraderia_1_2_6);
		panelGraderia_1_2_6.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_5 = new Panel();
		panelGraderia_1_3_5.setBackground(Color.YELLOW);
		panelGraderia_1_3_5.setBounds(502, 315, 34, 31);
		contentPane.add(panelGraderia_1_3_5);
		panelGraderia_1_3_5.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_1_1 = new Panel();
		panelGraderia_1_2_1_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_1_1.setBounds(542, 315, 34, 31);
		contentPane.add(panelGraderia_1_2_1_1);
		panelGraderia_1_2_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_1_1 = new Panel();
		panelGraderia_1_3_1_1.setBackground(Color.YELLOW);
		panelGraderia_1_3_1_1.setBounds(582, 315, 34, 31);
		contentPane.add(panelGraderia_1_3_1_1);
		panelGraderia_1_3_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_2_1 = new Panel();
		panelGraderia_1_2_2_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_2_1.setBounds(622, 315, 34, 31);
		contentPane.add(panelGraderia_1_2_2_1);
		panelGraderia_1_2_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_2_1 = new Panel();
		panelGraderia_1_2_5_2_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_2_1.setBounds(462, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_2_1);
		panelGraderia_1_2_5_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_5 = new Panel();
		panelGraderia_1_2_5_5.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_5.setBounds(502, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_5);
		panelGraderia_1_2_5_5.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_1_1 = new Panel();
		panelGraderia_1_2_5_1_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_1_1.setBounds(542, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_1_1);
		panelGraderia_1_2_5_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_3_1 = new Panel();
		panelGraderia_1_2_5_3_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_3_1.setBounds(582, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_5_3_1);
		panelGraderia_1_2_5_3_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_4_1 = new Panel();
		panelGraderia_1_2_4_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_4_1.setBounds(622, 352, 34, 31);
		contentPane.add(panelGraderia_1_2_4_1);
		panelGraderia_1_2_4_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_4_1 = new Panel();
		panelGraderia_1_3_4_1.setBackground(Color.YELLOW);
		panelGraderia_1_3_4_1.setBounds(462, 389, 34, 31);
		contentPane.add(panelGraderia_1_3_4_1);
		panelGraderia_1_3_4_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_7_1 = new Panel();
		panelGraderia_1_7_1.setBackground(Color.YELLOW);
		panelGraderia_1_7_1.setBounds(502, 389, 34, 31);
		contentPane.add(panelGraderia_1_7_1);
		panelGraderia_1_7_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_4_1 = new Panel();
		panelGraderia_1_1_4_1.setBackground(Color.YELLOW);
		panelGraderia_1_1_4_1.setBounds(542, 389, 34, 31);
		contentPane.add(panelGraderia_1_1_4_1);
		panelGraderia_1_1_4_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_2_1 = new Panel();
		panelGraderia_1_1_2_1.setBackground(Color.YELLOW);
		panelGraderia_1_1_2_1.setBounds(582, 389, 34, 31);
		contentPane.add(panelGraderia_1_1_2_1);
		panelGraderia_1_1_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_6_1 = new Panel();
		panelGraderia_1_6_1.setBackground(Color.YELLOW);
		panelGraderia_1_6_1.setBounds(622, 389, 34, 31);
		contentPane.add(panelGraderia_1_6_1);
		panelGraderia_1_6_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_2_1 = new Panel();
		panelGraderia_1_3_2_1.setBackground(Color.YELLOW);
		panelGraderia_1_3_2_1.setBounds(462, 426, 34, 31);
		contentPane.add(panelGraderia_1_3_2_1);
		panelGraderia_1_3_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_3_1 = new Panel();
		panelGraderia_1_2_3_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_3_1.setBounds(502, 426, 34, 31);
		contentPane.add(panelGraderia_1_2_3_1);
		panelGraderia_1_2_3_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_3_3_1 = new Panel();
		panelGraderia_1_3_3_1.setBackground(Color.YELLOW);
		panelGraderia_1_3_3_1.setBounds(542, 426, 34, 31);
		contentPane.add(panelGraderia_1_3_3_1);
		panelGraderia_1_3_3_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_1_3_1 = new Panel();
		panelGraderia_1_1_3_1.setBackground(Color.YELLOW);
		panelGraderia_1_1_3_1.setBounds(582, 426, 34, 31);
		contentPane.add(panelGraderia_1_1_3_1);
		panelGraderia_1_1_3_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_1_2_5_4_1 = new Panel();
		panelGraderia_1_2_5_4_1.setBackground(Color.YELLOW);
		panelGraderia_1_2_5_4_1.setBounds(622, 426, 34, 31);
		contentPane.add(panelGraderia_1_2_5_4_1);
		panelGraderia_1_2_5_4_1.setLayout(new SpringLayout());
		
		JLabel graderiaGeneral = new JLabel("Graderia General");
		graderiaGeneral.setBounds(350, 497, 109, 14);
		contentPane.add(graderiaGeneral);
		
		Panel panelGraderiaGeneral_1 = new Panel();
		panelGraderiaGeneral_1.setBackground(Color.RED);
		panelGraderiaGeneral_1.setBounds(213, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_1);
		panelGraderiaGeneral_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2 = new Panel();
		panelGraderiaGeneral_2.setBackground(Color.RED);
		panelGraderiaGeneral_2.setBounds(253, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_2);
		panelGraderiaGeneral_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3 = new Panel();
		panelGraderiaGeneral_3.setBackground(Color.RED);
		panelGraderiaGeneral_3.setBounds(293, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_3);
		panelGraderiaGeneral_3.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4 = new Panel();
		panelGraderiaGeneral_4.setBackground(Color.RED);
		panelGraderiaGeneral_4.setBounds(333, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_4);
		panelGraderiaGeneral_4.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1 = new Panel();
		panelGraderiaGeneral_4_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_1.setBounds(373, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1);
		panelGraderiaGeneral_4_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_1_1 = new Panel();
		panelGraderiaGeneral_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_1_1.setBounds(413, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_1_1);
		panelGraderiaGeneral_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2_1 = new Panel();
		panelGraderiaGeneral_2_1.setBackground(Color.RED);
		panelGraderiaGeneral_2_1.setBounds(453, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_2_1);
		panelGraderiaGeneral_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3_1 = new Panel();
		panelGraderiaGeneral_3_1.setBackground(Color.RED);
		panelGraderiaGeneral_3_1.setBounds(493, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_3_1);
		panelGraderiaGeneral_3_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_2 = new Panel();
		panelGraderiaGeneral_4_2.setBackground(Color.RED);
		panelGraderiaGeneral_4_2.setBounds(533, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_2);
		panelGraderiaGeneral_4_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1_1 = new Panel();
		panelGraderiaGeneral_4_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_1_1.setBounds(573, 529, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1_1);
		panelGraderiaGeneral_4_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_1_2 = new Panel();
		panelGraderiaGeneral_1_2.setBackground(Color.RED);
		panelGraderiaGeneral_1_2.setBounds(213, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_1_2);
		panelGraderiaGeneral_1_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2_2 = new Panel();
		panelGraderiaGeneral_2_2.setBackground(Color.RED);
		panelGraderiaGeneral_2_2.setBounds(253, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_2_2);
		panelGraderiaGeneral_2_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3_2 = new Panel();
		panelGraderiaGeneral_3_2.setBackground(Color.RED);
		panelGraderiaGeneral_3_2.setBounds(293, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_3_2);
		panelGraderiaGeneral_3_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_3 = new Panel();
		panelGraderiaGeneral_4_3.setBackground(Color.RED);
		panelGraderiaGeneral_4_3.setBounds(333, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_3);
		panelGraderiaGeneral_4_3.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1_2 = new Panel();
		panelGraderiaGeneral_4_1_2.setBackground(Color.RED);
		panelGraderiaGeneral_4_1_2.setBounds(373, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1_2);
		panelGraderiaGeneral_4_1_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_1_1_1 = new Panel();
		panelGraderiaGeneral_1_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_1_1_1.setBounds(413, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_1_1_1);
		panelGraderiaGeneral_1_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2_1_1 = new Panel();
		panelGraderiaGeneral_2_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_2_1_1.setBounds(453, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_2_1_1);
		panelGraderiaGeneral_2_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3_1_1 = new Panel();
		panelGraderiaGeneral_3_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_3_1_1.setBounds(493, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_3_1_1);
		panelGraderiaGeneral_3_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_2_1 = new Panel();
		panelGraderiaGeneral_4_2_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_2_1.setBounds(533, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_2_1);
		panelGraderiaGeneral_4_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1_1_1 = new Panel();
		panelGraderiaGeneral_4_1_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_1_1_1.setBounds(573, 566, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1_1_1);
		panelGraderiaGeneral_4_1_1_1.setLayout(new SpringLayout());
	}
}
