import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{

	//Panel dane pracownika
	JPanel panelDane = new JPanel();
	
	JPanel panelDaneNapis = new JPanel();
	JLabel labelDaneNapis = new JLabel();
	
	JLabel labelImie = new JLabel("Imię");
	JLabel labelNazwisko = new JLabel("Nazwisko");
	JLabel labelStanowisko = new JLabel("Stanowisko");
	
	JTextField textFieldImie = new JTextField();
	JTextField textFieldNazwisko = new JTextField();
	
	String[] choices = {" ", "Ziom", "Szef", "Łobuz"};
	JComboBox<String> comboBoxStanowisko = new JComboBox<String>(choices);
	//Panel dane pracownika
	
	
	//Panel generowanie hasła
	JPanel panelHaslo = new JPanel();
	
	JPanel panelHasloNapis = new JPanel();
	JLabel labelHasloNapis = new JLabel();
	
	JLabel labelIleZnakow = new JLabel("Ile znaków?");
	JLabel labelLitery = new JLabel("Małe i wielkie litery");
	JLabel labelCyfry = new JLabel("Cyfry");
	JLabel labelZnakiS = new JLabel("Znaki specjalne");
	
	JCheckBox checkBoxLitery = new JCheckBox();
	JCheckBox checkBoxCyfry = new JCheckBox();
	JCheckBox checkBoxZnakiS = new JCheckBox();
	
	JTextField textFieldIleZnakow = new JTextField();
	
	JButton buttonGeneruj = new JButton();
	//Panel generowanie hasła
	
	JButton buttonZatwierdz = new JButton();
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,400);
		this.setLayout(null);
		getContentPane().setBackground(new java.awt.Color(176,196,222));
		
		//Panel dane rpacownika
		panelDane.setBounds(40,40,300,220);
		panelDane.setBackground(null);
		panelDane.setLayout(null);
		Border borderDane = BorderFactory.createLineBorder(Color.white, 5);
		panelDane.setBorder(borderDane);
		
		panelDane.add(labelImie);
		labelImie.setBounds(25,20,100,40);
		panelDane.add(textFieldImie);
		textFieldImie.setBounds(120,30,150,25);
		
		panelDane.add(labelNazwisko);
		labelNazwisko.setBounds(25,70,100,40);
		panelDane.add(textFieldNazwisko);
		textFieldNazwisko.setBounds(120,80,150,25);
		
		panelDane.add(labelStanowisko);
		labelStanowisko.setBounds(25,120,100,40);
		panelDane.add(comboBoxStanowisko);
		comboBoxStanowisko.setBounds(120,130,150,25);
		//Panel dane pracownika
		
		//Panel generowanie hasła
		panelHaslo.setBounds(440,40,300,220);
		panelHaslo.setBackground(null);
		panelHaslo.setBorder(borderDane);
		panelHaslo.setLayout(null);
		
		panelHaslo.add(labelIleZnakow);
		labelIleZnakow.setBounds(25,20,100,40);
		panelHaslo.add(textFieldIleZnakow);
		textFieldIleZnakow.setBounds(120,30,150,25);
		
		panelHaslo.add(checkBoxLitery);
		checkBoxLitery.setBounds(25,70,20,20);
		checkBoxLitery.setBackground(new java.awt.Color(176,196,222));
		panelHaslo.add(labelLitery);
		labelLitery.setBounds(50,60,150,40);
		
		panelHaslo.add(checkBoxCyfry);
		checkBoxCyfry.setBounds(25,105,20,20);
		checkBoxCyfry.setBackground(new java.awt.Color(176,196,222));
		panelHaslo.add(labelCyfry);
		labelCyfry.setBounds(50,95,100,40);
		
		panelHaslo.add(checkBoxZnakiS);
		checkBoxZnakiS.setBounds(25,140,20,20);
		checkBoxZnakiS.setBackground(new java.awt.Color(176,196,222));
		panelHaslo.add(labelZnakiS);
		labelZnakiS.setBounds(50,140,100,20);
		
		panelHaslo.add(buttonGeneruj);
		buttonGeneruj.setBounds(100,180,88,22);
		Border borderButton = BorderFactory.createLineBorder(Color.white, 1);
		buttonGeneruj.setBorder(borderButton);
		buttonGeneruj.setBackground(new java.awt.Color(70,130,180));
		buttonGeneruj.setText("Generuj hasło");
		buttonGeneruj.setForeground(Color.white);
		buttonGeneruj.setMargin(new Insets(1,1,1,1));
		//Panel generowanie hasła
		
		//Przycisk zatwierdzający
		buttonZatwierdz.setBounds(265,315,250,25);
		buttonZatwierdz.setBorder(borderButton);
		buttonZatwierdz.setText("Zatwierdź");
		buttonZatwierdz.setForeground(Color.white);
		buttonZatwierdz.setBackground(new java.awt.Color(70,130,180));
		//Przycisk zatwierdzający
		
		this.add(buttonZatwierdz);
		this.add(panelHaslo);
		this.add(panelDane);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
