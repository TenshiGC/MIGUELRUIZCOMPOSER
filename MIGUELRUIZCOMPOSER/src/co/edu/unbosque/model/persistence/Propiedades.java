package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Reguetonton reg;
	private Properties prop = new Properties();
	private String archivoprop = "c:\\data\\Composerproperties.txt";
	
	public Propiedades() {
		reg = new Reguetonton();
	}
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "ComposerReggaeton");
			prop.setProperty("Artista" ,reg.artista());
			prop.setProperty("Estrofas" ,Integer.toString(reg.estrofas()));
			prop.setProperty("Frases" ,Integer.toString(reg.frases()));
			prop.store(new FileOutputStream(archivoprop),null);
		}
		catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			
			linea+= "nombre del Proyecto: "+ prop.getProperty("nombreProyecto")+"\n";
			linea+= "nombre del Artista: "+ prop.getProperty("Artista")+"\n";
			linea+= "numero de Estrofas: "+ prop.getProperty("Estrofas")+"\n";
			linea+= "numero de Frases: "+ prop.getProperty("Frases")+"\n";
		}
		catch (IOException ex) {
			return null;
		}
		return linea;
	}
}
