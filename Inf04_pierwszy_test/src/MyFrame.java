import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel labelUlica = new JLabel("Ulica z numerem");
	JLabel labelKod = new JLabel("Kod pocztowy");
	JLabel labelMiasto = new JLabel("Miasto");
	JLabel labelPolePrzesylka = new JLabel("Rodzaj przesyłki");
	JLabel labelPoleDupa = new JLabel("Dane adresowe");
	JLabel labelCena = new JLabel("Cena:");
	JLabel labelPocztowka = new JLabel("Pocztówka");
	JLabel labelList = new JLabel("List");
	JLabel labelPaczka = new JLabel("Paczka");
	JTextField fieldUlica = new JTextField();
	JTextField fieldKod = new JTextField();
	JTextField fieldMiasto = new JTextField();
	JButton buttonCena = new JButton();
	JButton buttonZatwierdz = new JButton();
	JRadioButton radioPocztowka = new JRadioButton();
	JRadioButton radioList = new JRadioButton();
	JRadioButton radioPaczka = new JRadioButton();
	ImageIcon iconList = new ImageIcon("list.png");
	ImageIcon iconPaczka = new ImageIcon("paczka.png");
	ImageIcon iconPocztowka = new ImageIcon("pocztowka.png");
	JLabel labelIcon = new JLabel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
			
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,400);
		this.setLayout(null);
		
//Napis na obwodzie menu adresu
		panel4.setBounds(340, 20, 95, 40);
		panel4.setBackground(null);
		panel4.setLayout(null);
		panel4.add(labelPoleDupa);
		labelPoleDupa.setBounds(1,1,100,50);
		
//Menu adresu
		Border borderDane = BorderFactory.createLineBorder(Color.gray);
		panel2.setBounds(330,45,320,230);
		panel2.setBackground(null);
		panel2.setBorder(borderDane);
		panel2.setLayout(null);
		panel2.add(labelUlica);
		panel2.add(fieldUlica);
		panel2.add(labelKod);
		panel2.add(fieldKod);
		panel2.add(labelMiasto);
		panel2.add(fieldMiasto);
		labelUlica.setBounds(30,10,100,50);
		labelKod.setBounds(30,70,100,50);
		labelMiasto.setBounds(30,130,100,50);
		fieldUlica.setBounds(30,50,270,25);
		fieldKod.setBounds(30,110,100,25);
		fieldMiasto.setBounds(30,170,270,25);
		
//Napis na obwodzie menu przesyłek
		panel3.setBounds(50, 20, 100, 40);
		panel3.setBackground(null);
		panel3.setLayout(null);
		panel3.add(labelPolePrzesylka);
		labelPolePrzesylka.setBounds(1,1,100,50);
		
//Menu przesyłek 
		Border borderPrzesylka = BorderFactory.createLineBorder(Color.gray);
		panel1.setBounds(40,45,200,113);
		panel1.setBackground(null);
		panel1.setBorder(borderPrzesylka);
		panel1.setLayout(null);
		panel1.add(radioList);
		panel1.add(labelList);
		panel1.add(radioPocztowka);
		panel1.add(labelPocztowka);
		panel1.add(radioPaczka);
		panel1.add(labelPaczka);
		radioPocztowka.setBounds(10,20,20,20);
		labelPocztowka.setBounds(34,5,100,50);
		radioList.setBounds(10,50,20,20);
		labelList.setBounds(34,35,100,50);
		radioPaczka.setBounds(10,80,20,20);
		labelPaczka.setBounds(34,65,100,50);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioList);
		group.add(radioPaczka);
		group.add(radioPocztowka);
		
		buttonCena.setBounds(40,165,200,25);
		buttonCena.setText("Sprawdz Cenę");
		buttonCena.addActionListener(this);
		
		buttonZatwierdz.setBounds(40,333,610,25);
		buttonZatwierdz.setText("Zatwierdz");
		buttonZatwierdz.addActionListener(this);
		
		labelIcon.setIcon(iconList);
		labelIcon.setBounds(40,200,80,80);
		labelIcon.setVisible(false);
		
		labelCena.setBounds(142,205,100,50);
		labelCena.setFont(new Font(null,Font.BOLD,18));
		
		//panel1.setBounds(40,50,300,300);
		//panel1.setBorder(BorderFactory.createLineBorder(Color.gray));

		this.add(panel3);
		this.add(panel4);
		this.add(panel2);
		this.add(panel1);
		this.add(labelCena);
		this.add(labelIcon);
		this.add(buttonZatwierdz);
		this.add(buttonCena);
		//this.add(labelPaczka);
		//this.add(radioPaczka);
		//this.add(labelList);
		//this.add(radioList);
		//this.add(labelPocztowka);
		//this.add(radioPocztowka);
		//this.add(fieldMiasto);
		//this.add(fieldKod);
		//this.add(fieldUlica);
		//this.add(labelMiasto);
		//this.add(labelKod);
		//this.add(labelUlica);
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==buttonCena) {
			if(radioList.isSelected()) {
				labelIcon.setIcon(iconList);
				labelIcon.setVisible(true);
				labelCena.setText("Cena: 1,5");
			}
			else if(radioPocztowka.isSelected()) {
				labelIcon.setIcon(iconPocztowka);
				labelIcon.setVisible(true);
				labelCena.setText("Cena: 2");
			}
			else if(radioPaczka.isSelected()) {
				labelIcon.setIcon(iconPaczka);
				labelIcon.setVisible(true);
				labelCena.setText("Cena: 10");
			}
		}
		
		if(e.getSource()==buttonZatwierdz) {
			String kod = fieldKod.getText();
			if(kod.length()==5) {
				showMessageDialog(null, "Przesyłka została nadana");
				fieldKod.setText("");
				fieldMiasto.setText("");
				fieldUlica.setText("");
			}
			else {
				showMessageDialog(null, "Nieprawidłowe dane przesyłki");
			}
		}
		
	}

}