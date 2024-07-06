import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener, MouseListener {

	JLabel labelNumer = new JLabel("Numer");
	JLabel labelImie = new JLabel("Imię");
	JLabel labelNazwisko = new JLabel("Nazwisko");
	JLabel labelNiebieskie = new JLabel("niebieskie");
	JLabel labelZielone = new JLabel("zielone");
	JLabel labelPiwne = new JLabel("piwne");
	JRadioButton radioNiebieskie = new JRadioButton();
	JRadioButton radioZielone = new JRadioButton();
	JRadioButton radioPiwne = new JRadioButton();
	JTextField textfieldNumer = new JTextField();
	JTextField textfieldImie = new JTextField();
	JTextField textfieldNazwisko = new JTextField();
	JButton buttonOk = new JButton();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel labelPanel2 = new JLabel("Kolor oczu");
	ImageIcon odcisk000 = new ImageIcon("000-odcisk.jpg");
	ImageIcon odcisk111 = new ImageIcon("111-odcisk.jpg");
	ImageIcon odcisk222 = new ImageIcon("222-odcisk.jpg");
	ImageIcon zdjecie000 = new ImageIcon("000-zdjecie.jpg");
	ImageIcon zdjecie111 = new ImageIcon("111-zdjecie.jpg");
	ImageIcon zdjecie222 = new ImageIcon("222-zdjecie.jpg");
	JLabel labelOdcisk = new JLabel();
	JLabel labelZdjecie = new JLabel();
	JLabel labelOczy = new JLabel();
	
	 
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,400);
		this.setLayout(null);
		getContentPane().setBackground(new java.awt.Color(95,158,160,255));
		
		Border borderPanel = BorderFactory.createLineBorder(Color.white, 5);
		panel1.setBounds(40,190,370,130);
		panel1.setBorder(borderPanel);
		panel1.setBackground(null);
		panel1.setLayout(null);
		panel1.add(radioNiebieskie);
		panel1.add(radioZielone);
		panel1.add(radioPiwne);
		panel1.add(labelNiebieskie);
		panel1.add(labelZielone);
		panel1.add(labelPiwne);
		radioNiebieskie.setBounds(20,20,25,25);
		radioNiebieskie.setBackground(null);
		radioZielone.setBounds(20,50,25,25);
		radioZielone.setBackground(null);
		radioPiwne.setBounds(20,80,25,25);
		radioPiwne.setBackground(null);
		labelNiebieskie.setBounds(45,20,100,20);
		labelZielone.setBounds(45,50,100,20);
		labelPiwne.setBounds(45,80,100,20);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioNiebieskie);
		group.add(radioPiwne);
		group.add(radioZielone);
		
		panel2.setBounds(50,178,75,30);
		panel2.setBackground(null);
		panel2.add(labelPanel2);
		
		labelNumer.setBounds(40,15,100,50);
		labelImie.setBounds(40,55,100,50);
		labelNazwisko.setBounds(40,95,100,50);
		
		textfieldNumer.setBounds(170,30,240,20);
		textfieldNumer.addMouseListener(this);
		textfieldImie.setBounds(170,70,240,20);
		textfieldNazwisko.setBounds(170,110,240,20);
		
		labelZdjecie.setIcon(zdjecie000);
		labelZdjecie.setVisible(true);
		labelZdjecie.setBounds(450,30,180,230);
		
		labelOdcisk.setIcon(odcisk000);
		labelOdcisk.setVisible(true);
		labelOdcisk.setBounds(700,30,150,230);
		
		buttonOk.setBounds(530,300,270,40);
		buttonOk.setText("OK");
		buttonOk.addActionListener(this);
		
		this.add(buttonOk);
		this.add(labelZdjecie);
		this.add(labelOdcisk);
		this.add(textfieldNazwisko);
		this.add(textfieldImie);
		this.add(textfieldNumer);
		this.add(labelImie);
		this.add(labelNazwisko);
		this.add(labelNumer);
		this.add(panel2);
		this.add(panel1);
		this.setVisible(true);
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==buttonOk) {
			String imie = textfieldImie.getText();
			String nazwisko = textfieldNazwisko.getText();
			String kolor = null;
			if(radioNiebieskie.isSelected()) {
				kolor = "niebieskie";
			}
			else if(radioZielone.isSelected()) {
				kolor = "zielone";
			}
			else if(radioPiwne.isSelected()){
				kolor = "piwne";
			}
			else {
				kolor = "";
			}
			showMessageDialog(null, imie + " " + nazwisko + " " + kolor);
		}
		
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e) {
		String text;
		text = textfieldNumer.getText();
		int number = Integer.valueOf(text);
		if(number == 000) {
			labelZdjecie.setIcon(zdjecie000);
			labelOdcisk.setIcon(odcisk000);
		}
		else if(number == 111) {
			labelZdjecie.setIcon(zdjecie111);
			labelOdcisk.setIcon(odcisk111);
		}
		else if(number == 222) {
			labelZdjecie.setIcon(zdjecie222);
			labelOdcisk.setIcon(odcisk222);
		}
		else {
			labelZdjecie.setIcon(null);
			labelOdcisk.setIcon(null);
		}
		
	}
	
	
}
