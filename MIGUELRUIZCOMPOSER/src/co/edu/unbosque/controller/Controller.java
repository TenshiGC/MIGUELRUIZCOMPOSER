package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Gestiones;
import co.edu.unbosque.model.persistence.Reguetonton;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

		private View view;
		private Gestiones ges;
		private Reguetonton reg;
		
		public Controller() {
			view = new View();
			ges = new Gestiones();
			reg = new Reguetonton();
			actionListeners();
		}
		
		public void actionListeners() {
			view.getPbotones().getSave().addActionListener(this);
			view.getPbotones().getRehacer().addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("GENERAR")) {
				view.getPtexto().getCampoletra().setText(reg.Letra());
				
			}else if (e.getActionCommand().equals("GUARDAR")){
				
				ges.pathProp();
				
				JFileChooser fs = new JFileChooser("c:\\data\\");
				
				fs.setDialogTitle("Guardar Archivo");
				
				int result = fs.showSaveDialog(null);
				
				if (result==JFileChooser.APPROVE_OPTION) {
					
					String content = view.getPtexto().getCampoletra().getText();
					
					File fi = new File(fs.getSelectedFile()+".txt");
					
					try {
						FileWriter fw = new FileWriter(fi.getPath());
						fw.write(content);
						fw.flush();
						fw.close();
						
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null, e2.getMessage());
					}
				}
				view.mostrarResultados(ges.gestionarPropiedades());
			}
		}
		
}
