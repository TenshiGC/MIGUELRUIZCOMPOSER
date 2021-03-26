package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class View extends JFrame {
	
	private JLayeredPane lpane;
	private PanelTexto ptexto;
	private PanelBotones pbotones;
	
	public void mostrarResultados(String dato) {
		JOptionPane.showMessageDialog(null, dato, "Propiedades:)", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public View() {
		setTitle("Letra Regueton");
		setSize(708,360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setBackground(Color.LIGHT_GRAY);
	}
	public void inicializarComponentes() {
		lpane = new JLayeredPane(); 
		getContentPane().add(lpane,BorderLayout.CENTER);
		lpane.setBounds(0,0,708,350);
		
		ptexto = new PanelTexto();
		ptexto.setBounds(10, 10, 526, 300);
		ptexto.setOpaque(true);
		lpane.add(ptexto,new Integer(0),0);
		
		pbotones = new PanelBotones();
		pbotones.setBounds(540, 50, 150, 150);
		pbotones.setOpaque(false);
		lpane.add(pbotones,new Integer(0),0);
	}
	public PanelTexto getPtexto() {
		return ptexto;
	}
	public void setPtexto(PanelTexto ptexto) {
		this.ptexto = ptexto;
	}
	public PanelBotones getPbotones() {
		return pbotones;
	}
	public void setPbotones(PanelBotones pbotones) {
		this.pbotones = pbotones;
	}
}
