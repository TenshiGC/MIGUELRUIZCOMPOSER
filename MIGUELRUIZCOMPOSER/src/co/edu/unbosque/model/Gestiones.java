package co.edu.unbosque.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import co.edu.unbosque.model.persistence.Propiedades;

public class Gestiones {
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		return "Se leyeron las siguientes propiedades: "+"\n"+prop.leerPropiedades();
	}
	public void pathProp() {
		
		Path path = Paths.get("C:\\data\\");
		
		try {
			if (!Files.exists(path)) {
				Files.createDirectory(path);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
