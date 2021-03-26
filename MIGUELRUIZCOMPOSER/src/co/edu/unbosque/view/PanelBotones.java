package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel{

	private JButton save;
	private JButton rehacer;
	private JLabel aux;
	
	public PanelBotones() {
		setLayout(new GridLayout(3,1));
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		setBorder(new TitledBorder(null, "Opciones:", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
				null, Color.white));
		
		save = new JButton("GUARDAR");
		save.setActionCommand("GUARDAR");
		add(save);
		
		aux = new JLabel();
		add(aux);
		
		rehacer = new JButton("GENERAR LETRA");
		rehacer.setActionCommand("GENERAR");
		add(rehacer);

	}

	public JButton getSave() {
		return save;
	}

	public void setSave(JButton save) {
		this.save = save;
	}

	public JButton getRehacer() {
		return rehacer;
	}

	public void setRehacer(JButton rehacer) {
		this.rehacer = rehacer;
	}

}
