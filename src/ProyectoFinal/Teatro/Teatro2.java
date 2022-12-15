package ProyectoFinal.Teatro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

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
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.Image;

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
		setBounds(100, 100, 797, 811);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel areaPreferencial = new JLabel("Area Preferencial");
		areaPreferencial.setBounds(350, 258, 83, 14);
		contentPane.add(areaPreferencial);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 283, 761, 2);
		contentPane.add(separator);
		
		Panel panelPreferencial_1 = new Panel();
		panelPreferencial_1.setBackground(Color.ORANGE);
		panelPreferencial_1.setBounds(83, 291, 34, 31);
		contentPane.add(panelPreferencial_1);
		panelPreferencial_1.setLayout(new SpringLayout());
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 328, 761, 2);
		contentPane.add(separator_1);
		
		Panel panelPreferencial_2 = new Panel();
		panelPreferencial_2.setBackground(Color.ORANGE);
		panelPreferencial_2.setBounds(123, 291, 34, 31);
		contentPane.add(panelPreferencial_2);
		panelPreferencial_2.setLayout(new SpringLayout());
		
		Panel panelPreferencial_3 = new Panel();
		panelPreferencial_3.setBackground(Color.ORANGE);
		panelPreferencial_3.setBounds(213, 291, 34, 31);
		contentPane.add(panelPreferencial_3);
		panelPreferencial_3.setLayout(new SpringLayout());
		
		Panel panelPreferencial_4 = new Panel();
		panelPreferencial_4.setBackground(Color.ORANGE);
		panelPreferencial_4.setBounds(253, 291, 34, 31);
		contentPane.add(panelPreferencial_4);
		panelPreferencial_4.setLayout(new SpringLayout());
		
		Panel panelPreferencial_5 = new Panel();
		panelPreferencial_5.setBackground(Color.ORANGE);
		panelPreferencial_5.setBounds(343, 291, 34, 31);
		contentPane.add(panelPreferencial_5);
		panelPreferencial_5.setLayout(new SpringLayout());
		
		Panel panelPreferencial_6 = new Panel();
		panelPreferencial_6.setBackground(Color.ORANGE);
		panelPreferencial_6.setBounds(383, 291, 34, 31);
		contentPane.add(panelPreferencial_6);
		panelPreferencial_6.setLayout(new SpringLayout());
		
		Panel panelPreferencial_7 = new Panel();
		panelPreferencial_7.setBackground(Color.ORANGE);
		panelPreferencial_7.setBounds(473, 291, 34, 31);
		contentPane.add(panelPreferencial_7);
		panelPreferencial_7.setLayout(new SpringLayout());
		
		Panel panelPreferencial_8 = new Panel();
		panelPreferencial_8.setBackground(Color.ORANGE);
		panelPreferencial_8.setBounds(513, 291, 34, 31);
		contentPane.add(panelPreferencial_8);
		panelPreferencial_8.setLayout(new SpringLayout());
		
		Panel panelPreferencial_9 = new Panel();
		panelPreferencial_9.setBackground(Color.ORANGE);
		panelPreferencial_9.setBounds(603, 291, 34, 31);
		contentPane.add(panelPreferencial_9);
		panelPreferencial_9.setLayout(new SpringLayout());
		
		Panel panelPreferencial_10 = new Panel();
		panelPreferencial_10.setBackground(Color.ORANGE);
		panelPreferencial_10.setBounds(643, 291, 34, 31);
		contentPane.add(panelPreferencial_10);
		panelPreferencial_10.setLayout(new SpringLayout());
		
		JLabel lblGraderiaPreferencial = new JLabel("Graderia Preferencial");
		lblGraderiaPreferencial.setBounds(350, 365, 109, 14);
		contentPane.add(lblGraderiaPreferencial);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 390, 761, 2);
		contentPane.add(separator_1_1);
		
		Panel panelGraderia_1 = new Panel();
		panelGraderia_1.setBackground(Color.YELLOW);
		panelGraderia_1.setBounds(133, 398, 34, 31);
		contentPane.add(panelGraderia_1);
		panelGraderia_1.setLayout(new SpringLayout());
		
		Panel panelGraderia_2 = new Panel();
		panelGraderia_2.setBackground(Color.YELLOW);
		panelGraderia_2.setBounds(173, 398, 34, 31);
		contentPane.add(panelGraderia_2);
		panelGraderia_2.setLayout(new SpringLayout());
		
		Panel panelGraderia_6 = new Panel();
		panelGraderia_6.setBackground(Color.YELLOW);
		panelGraderia_6.setBounds(133, 435, 34, 31);
		contentPane.add(panelGraderia_6);
		panelGraderia_6.setLayout(new SpringLayout());
		
		Panel panelGraderia_7 = new Panel();
		panelGraderia_7.setBackground(Color.YELLOW);
		panelGraderia_7.setBounds(173, 435, 34, 31);
		contentPane.add(panelGraderia_7);
		panelGraderia_7.setLayout(new SpringLayout());
		
		Panel panelGraderia_3 = new Panel();
		panelGraderia_3.setBackground(Color.YELLOW);
		panelGraderia_3.setBounds(213, 398, 34, 31);
		contentPane.add(panelGraderia_3);
		panelGraderia_3.setLayout(new SpringLayout());
		
		Panel panelGraderia_4 = new Panel();
		panelGraderia_4.setBackground(Color.YELLOW);
		panelGraderia_4.setBounds(253, 398, 34, 31);
		contentPane.add(panelGraderia_4);
		panelGraderia_4.setLayout(new SpringLayout());
		
		Panel panelGraderia_8 = new Panel();
		panelGraderia_8.setBackground(Color.YELLOW);
		panelGraderia_8.setBounds(213, 435, 34, 31);
		contentPane.add(panelGraderia_8);
		panelGraderia_8.setLayout(new SpringLayout());
		
		Panel panelGraderia_9 = new Panel();
		panelGraderia_9.setBackground(Color.YELLOW);
		panelGraderia_9.setBounds(253, 435, 34, 31);
		contentPane.add(panelGraderia_9);
		panelGraderia_9.setLayout(new SpringLayout());
		
		Panel panelGraderia_5 = new Panel();
		panelGraderia_5.setBackground(Color.YELLOW);
		panelGraderia_5.setBounds(293, 398, 34, 31);
		contentPane.add(panelGraderia_5);
		panelGraderia_5.setLayout(new SpringLayout());
		
		Panel panelGraderia_19 = new Panel();
		panelGraderia_19.setBackground(Color.YELLOW);
		panelGraderia_19.setBounds(253, 509, 34, 31);
		contentPane.add(panelGraderia_19);
		panelGraderia_19.setLayout(new SpringLayout());
		
		Panel panelGraderia_10 = new Panel();
		panelGraderia_10.setBackground(Color.YELLOW);
		panelGraderia_10.setBounds(293, 435, 34, 31);
		contentPane.add(panelGraderia_10);
		panelGraderia_10.setLayout(new SpringLayout());
		
		Panel panelGraderia_21 = new Panel();
		panelGraderia_21.setBackground(Color.YELLOW);
		panelGraderia_21.setBounds(133, 546, 34, 31);
		contentPane.add(panelGraderia_21);
		panelGraderia_21.setLayout(new SpringLayout());
		
		Panel panelGraderia_20 = new Panel();
		panelGraderia_20.setBackground(Color.YELLOW);
		panelGraderia_20.setBounds(293, 509, 34, 31);
		contentPane.add(panelGraderia_20);
		panelGraderia_20.setLayout(new SpringLayout());
		
		Panel panelGraderia_24 = new Panel();
		panelGraderia_24.setBackground(Color.YELLOW);
		panelGraderia_24.setBounds(253, 546, 34, 31);
		contentPane.add(panelGraderia_24);
		panelGraderia_24.setLayout(new SpringLayout());
		
		Panel panelGraderia_22 = new Panel();
		panelGraderia_22.setBackground(Color.YELLOW);
		panelGraderia_22.setBounds(173, 546, 34, 31);
		contentPane.add(panelGraderia_22);
		panelGraderia_22.setLayout(new SpringLayout());
		
		Panel panelGraderia_23 = new Panel();
		panelGraderia_23.setBackground(Color.YELLOW);
		panelGraderia_23.setBounds(213, 546, 34, 31);
		contentPane.add(panelGraderia_23);
		panelGraderia_23.setLayout(new SpringLayout());
		
		Panel panelGraderia_17 = new Panel();
		panelGraderia_17.setBackground(Color.YELLOW);
		panelGraderia_17.setBounds(173, 509, 34, 31);
		contentPane.add(panelGraderia_17);
		panelGraderia_17.setLayout(new SpringLayout());
		
		Panel panelGraderia_18 = new Panel();
		panelGraderia_18.setBackground(Color.YELLOW);
		panelGraderia_18.setBounds(213, 509, 34, 31);
		contentPane.add(panelGraderia_18);
		panelGraderia_18.setLayout(new SpringLayout());
		
		Panel panelGraderia_15 = new Panel();
		panelGraderia_15.setBackground(Color.YELLOW);
		panelGraderia_15.setBounds(293, 472, 34, 31);
		contentPane.add(panelGraderia_15);
		panelGraderia_15.setLayout(new SpringLayout());
		
		Panel panelGraderia_16 = new Panel();
		panelGraderia_16.setBackground(Color.YELLOW);
		panelGraderia_16.setBounds(133, 509, 34, 31);
		contentPane.add(panelGraderia_16);
		panelGraderia_16.setLayout(new SpringLayout());
		
		Panel panelGraderia_12 = new Panel();
		panelGraderia_12.setBackground(Color.YELLOW);
		panelGraderia_12.setBounds(173, 472, 34, 31);
		contentPane.add(panelGraderia_12);
		panelGraderia_12.setLayout(new SpringLayout());
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 595, 761, 2);
		contentPane.add(separator_1_1_1);
		
		Panel panelGraderia_13 = new Panel();
		panelGraderia_13.setBackground(Color.YELLOW);
		panelGraderia_13.setBounds(213, 472, 34, 31);
		contentPane.add(panelGraderia_13);
		panelGraderia_13.setLayout(new SpringLayout());
		
		Panel panelGraderia_11 = new Panel();
		panelGraderia_11.setBackground(Color.YELLOW);
		panelGraderia_11.setBounds(133, 472, 34, 31);
		contentPane.add(panelGraderia_11);
		panelGraderia_11.setLayout(new SpringLayout());
		
		Panel panelGraderia_14 = new Panel();
		panelGraderia_14.setBackground(Color.YELLOW);
		panelGraderia_14.setBounds(253, 472, 34, 31);
		contentPane.add(panelGraderia_14);
		panelGraderia_14.setLayout(new SpringLayout());
		
		Panel panelGraderia_25 = new Panel();
		panelGraderia_25.setBackground(Color.YELLOW);
		panelGraderia_25.setBounds(293, 546, 34, 31);
		contentPane.add(panelGraderia_25);
		panelGraderia_25.setLayout(new SpringLayout());
		
		JLabel lblPasillo = new JLabel("Pasillo");
		lblPasillo.setBounds(380, 435, 40, 14);
		contentPane.add(lblPasillo);
		
		Panel panelGraderia_26 = new Panel();
		panelGraderia_26.setBackground(Color.YELLOW);
		panelGraderia_26.setBounds(462, 398, 34, 31);
		contentPane.add(panelGraderia_26);
		panelGraderia_26.setLayout(new SpringLayout());
		
		Panel panelGraderia_27 = new Panel();
		panelGraderia_27.setBackground(Color.YELLOW);
		panelGraderia_27.setBounds(502, 398, 34, 31);
		contentPane.add(panelGraderia_27);
		panelGraderia_27.setLayout(new SpringLayout());
		
		Panel panelGraderia_28 = new Panel();
		panelGraderia_28.setBackground(Color.YELLOW);
		panelGraderia_28.setBounds(542, 398, 34, 31);
		contentPane.add(panelGraderia_28);
		panelGraderia_28.setLayout(new SpringLayout());
		
		Panel panelGraderia_29 = new Panel();
		panelGraderia_29.setBackground(Color.YELLOW);
		panelGraderia_29.setBounds(582, 398, 34, 31);
		contentPane.add(panelGraderia_29);
		panelGraderia_29.setLayout(new SpringLayout());
		
		Panel panelGraderia_30 = new Panel();
		panelGraderia_30.setBackground(Color.YELLOW);
		panelGraderia_30.setBounds(622, 398, 34, 31);
		contentPane.add(panelGraderia_30);
		panelGraderia_30.setLayout(new SpringLayout());
		
		Panel panelGraderia_31 = new Panel();
		panelGraderia_31.setBackground(Color.YELLOW);
		panelGraderia_31.setBounds(462, 435, 34, 31);
		contentPane.add(panelGraderia_31);
		panelGraderia_31.setLayout(new SpringLayout());
		
		Panel panelGraderia_32 = new Panel();
		panelGraderia_32.setBackground(Color.YELLOW);
		panelGraderia_32.setBounds(502, 435, 34, 31);
		contentPane.add(panelGraderia_32);
		panelGraderia_32.setLayout(new SpringLayout());
		
		Panel panelGraderia_33 = new Panel();
		panelGraderia_33.setBackground(Color.YELLOW);
		panelGraderia_33.setBounds(542, 435, 34, 31);
		contentPane.add(panelGraderia_33);
		panelGraderia_33.setLayout(new SpringLayout());
		
		Panel panelGraderia_34 = new Panel();
		panelGraderia_34.setBackground(Color.YELLOW);
		panelGraderia_34.setBounds(582, 435, 34, 31);
		contentPane.add(panelGraderia_34);
		panelGraderia_34.setLayout(new SpringLayout());
		
		Panel panelGraderia_35 = new Panel();
		panelGraderia_35.setBackground(Color.YELLOW);
		panelGraderia_35.setBounds(622, 435, 34, 31);
		contentPane.add(panelGraderia_35);
		panelGraderia_35.setLayout(new SpringLayout());
		
		Panel panelGraderia_36 = new Panel();
		panelGraderia_36.setBackground(Color.YELLOW);
		panelGraderia_36.setBounds(462, 472, 34, 31);
		contentPane.add(panelGraderia_36);
		panelGraderia_36.setLayout(new SpringLayout());
		
		Panel panelGraderia_37 = new Panel();
		panelGraderia_37.setBackground(Color.YELLOW);
		panelGraderia_37.setBounds(502, 472, 34, 31);
		contentPane.add(panelGraderia_37);
		panelGraderia_37.setLayout(new SpringLayout());
		
		Panel panelGraderia_38 = new Panel();
		panelGraderia_38.setBackground(Color.YELLOW);
		panelGraderia_38.setBounds(542, 472, 34, 31);
		contentPane.add(panelGraderia_38);
		panelGraderia_38.setLayout(new SpringLayout());
		
		Panel panelGraderia_39 = new Panel();
		panelGraderia_39.setBackground(Color.YELLOW);
		panelGraderia_39.setBounds(582, 472, 34, 31);
		contentPane.add(panelGraderia_39);
		panelGraderia_39.setLayout(new SpringLayout());
		
		Panel panelGraderia_40 = new Panel();
		panelGraderia_40.setBackground(Color.YELLOW);
		panelGraderia_40.setBounds(622, 472, 34, 31);
		contentPane.add(panelGraderia_40);
		panelGraderia_40.setLayout(new SpringLayout());
		
		Panel panelGraderia_41 = new Panel();
		panelGraderia_41.setBackground(Color.YELLOW);
		panelGraderia_41.setBounds(462, 509, 34, 31);
		contentPane.add(panelGraderia_41);
		panelGraderia_41.setLayout(new SpringLayout());
		
		Panel panelGraderia_42 = new Panel();
		panelGraderia_42.setBackground(Color.YELLOW);
		panelGraderia_42.setBounds(502, 509, 34, 31);
		contentPane.add(panelGraderia_42);
		panelGraderia_42.setLayout(new SpringLayout());
		
		Panel panelGraderia_43 = new Panel();
		panelGraderia_43.setBackground(Color.YELLOW);
		panelGraderia_43.setBounds(542, 509, 34, 31);
		contentPane.add(panelGraderia_43);
		panelGraderia_43.setLayout(new SpringLayout());
		
		Panel panelGraderia_44 = new Panel();
		panelGraderia_44.setBackground(Color.YELLOW);
		panelGraderia_44.setBounds(582, 509, 34, 31);
		contentPane.add(panelGraderia_44);
		panelGraderia_44.setLayout(new SpringLayout());
		
		Panel panelGraderia_45 = new Panel();
		panelGraderia_45.setBackground(Color.YELLOW);
		panelGraderia_45.setBounds(622, 509, 34, 31);
		contentPane.add(panelGraderia_45);
		panelGraderia_45.setLayout(new SpringLayout());
		
		Panel panelGraderia_46 = new Panel();
		panelGraderia_46.setBackground(Color.YELLOW);
		panelGraderia_46.setBounds(462, 546, 34, 31);
		contentPane.add(panelGraderia_46);
		panelGraderia_46.setLayout(new SpringLayout());
		
		Panel panelGraderia_47 = new Panel();
		panelGraderia_47.setBackground(Color.YELLOW);
		panelGraderia_47.setBounds(502, 546, 34, 31);
		contentPane.add(panelGraderia_47);
		panelGraderia_47.setLayout(new SpringLayout());
		
		Panel panelGraderia_48 = new Panel();
		panelGraderia_48.setBackground(Color.YELLOW);
		panelGraderia_48.setBounds(542, 546, 34, 31);
		contentPane.add(panelGraderia_48);
		panelGraderia_48.setLayout(new SpringLayout());
		
		Panel panelGraderia_49 = new Panel();
		panelGraderia_49.setBackground(Color.YELLOW);
		panelGraderia_49.setBounds(582, 546, 34, 31);
		contentPane.add(panelGraderia_49);
		panelGraderia_49.setLayout(new SpringLayout());
		
		Panel panelGraderia_50 = new Panel();
		panelGraderia_50.setBackground(Color.YELLOW);
		panelGraderia_50.setBounds(622, 546, 34, 31);
		contentPane.add(panelGraderia_50);
		panelGraderia_50.setLayout(new SpringLayout());
		
		JLabel graderiaGeneral = new JLabel("Graderia General");
		graderiaGeneral.setBounds(350, 617, 109, 14);
		contentPane.add(graderiaGeneral);
		
		Panel panelGraderiaGeneral_1 = new Panel();
		panelGraderiaGeneral_1.setBackground(Color.RED);
		panelGraderiaGeneral_1.setBounds(213, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_1);
		panelGraderiaGeneral_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2 = new Panel();
		panelGraderiaGeneral_2.setBackground(Color.RED);
		panelGraderiaGeneral_2.setBounds(253, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_2);
		panelGraderiaGeneral_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3 = new Panel();
		panelGraderiaGeneral_3.setBackground(Color.RED);
		panelGraderiaGeneral_3.setBounds(293, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_3);
		panelGraderiaGeneral_3.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4 = new Panel();
		panelGraderiaGeneral_4.setBackground(Color.RED);
		panelGraderiaGeneral_4.setBounds(333, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_4);
		panelGraderiaGeneral_4.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1 = new Panel();
		panelGraderiaGeneral_4_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_1.setBounds(373, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1);
		panelGraderiaGeneral_4_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_1_1 = new Panel();
		panelGraderiaGeneral_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_1_1.setBounds(413, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_1_1);
		panelGraderiaGeneral_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2_1 = new Panel();
		panelGraderiaGeneral_2_1.setBackground(Color.RED);
		panelGraderiaGeneral_2_1.setBounds(453, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_2_1);
		panelGraderiaGeneral_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3_1 = new Panel();
		panelGraderiaGeneral_3_1.setBackground(Color.RED);
		panelGraderiaGeneral_3_1.setBounds(493, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_3_1);
		panelGraderiaGeneral_3_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_2 = new Panel();
		panelGraderiaGeneral_4_2.setBackground(Color.RED);
		panelGraderiaGeneral_4_2.setBounds(533, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_2);
		panelGraderiaGeneral_4_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1_1 = new Panel();
		panelGraderiaGeneral_4_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_1_1.setBounds(573, 649, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1_1);
		panelGraderiaGeneral_4_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_1_2 = new Panel();
		panelGraderiaGeneral_1_2.setBackground(Color.RED);
		panelGraderiaGeneral_1_2.setBounds(213, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_1_2);
		panelGraderiaGeneral_1_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2_2 = new Panel();
		panelGraderiaGeneral_2_2.setBackground(Color.RED);
		panelGraderiaGeneral_2_2.setBounds(253, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_2_2);
		panelGraderiaGeneral_2_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3_2 = new Panel();
		panelGraderiaGeneral_3_2.setBackground(Color.RED);
		panelGraderiaGeneral_3_2.setBounds(293, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_3_2);
		panelGraderiaGeneral_3_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_3 = new Panel();
		panelGraderiaGeneral_4_3.setBackground(Color.RED);
		panelGraderiaGeneral_4_3.setBounds(333, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_3);
		panelGraderiaGeneral_4_3.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1_2 = new Panel();
		panelGraderiaGeneral_4_1_2.setBackground(Color.RED);
		panelGraderiaGeneral_4_1_2.setBounds(373, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1_2);
		panelGraderiaGeneral_4_1_2.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_1_1_1 = new Panel();
		panelGraderiaGeneral_1_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_1_1_1.setBounds(413, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_1_1_1);
		panelGraderiaGeneral_1_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_2_1_1 = new Panel();
		panelGraderiaGeneral_2_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_2_1_1.setBounds(453, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_2_1_1);
		panelGraderiaGeneral_2_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_3_1_1 = new Panel();
		panelGraderiaGeneral_3_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_3_1_1.setBounds(493, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_3_1_1);
		panelGraderiaGeneral_3_1_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_2_1 = new Panel();
		panelGraderiaGeneral_4_2_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_2_1.setBounds(533, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_2_1);
		panelGraderiaGeneral_4_2_1.setLayout(new SpringLayout());
		
		Panel panelGraderiaGeneral_4_1_1_1 = new Panel();
		panelGraderiaGeneral_4_1_1_1.setBackground(Color.RED);
		panelGraderiaGeneral_4_1_1_1.setBounds(573, 686, 34, 31);
		contentPane.add(panelGraderiaGeneral_4_1_1_1);
		panelGraderiaGeneral_4_1_1_1.setLayout(new SpringLayout());
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Crowind\\Documents\\ProyectoFinal\\ProyectoProgra\\src\\Imagenes\\teatro.jpg"));
		lblNewLabel.setBounds(10, 11, 761, 236);
		contentPane.add(lblNewLabel);
	}
	
	/*class FondoPanel extends JPanel {
		private Image imagen;
		
		public void paint(Graphics g) {
			imagen = new ImageIcon(getClass().getResource("/Imagenes/teatro.jpg")).getImage();
			
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
		}
	}*/
}
