package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelTexto extends JPanel{

	private JTextArea campoletra;
	
	public PanelTexto() {
		setLayout(new GridLayout(1,1));
		inicializarComponentes();
	}
	public void inicializarComponentes() {
		setBackground(Color.white);
		setBorder(new TitledBorder("LA LETRA DEL CUMBION ES:"));
		
		campoletra = new JTextArea();
		campoletra.setEditable(false);
		add(campoletra);		
	}
	public JTextArea getCampoletra() {
		return campoletra;
	}
	public void setCampoletra(JTextArea campoletra) {
		this.campoletra = campoletra;
	}
}
