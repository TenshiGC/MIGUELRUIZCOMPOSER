package co.edu.unbosque.model.persistence;

public class Reguetonton {
	
	public String[] lista1;
	public String[] lista2;
	public String[] lista3;
	public String[] lista4;
	public String[] lista5;
	public String[] lista6;
	public String[] artistas;

	public Reguetonton() {
		lista1 = new String[4];
		lista2 = new String[4];
		lista3 = new String[4];
		lista4 = new String[4];
		lista5 = new String[4];
		lista6 = new String[4];
		artistas = new String [10];
		FullList();
	}
	
	public void FullList() {
		lista1[0] = "MAMI ";
		lista1[1] = "BEBÉ ";
		lista1[2] = "PRINCESS ";
		lista1[3] = "MAMI ";
		
		lista2[0] = "YO QUIERO ";
		lista2[1] = "YO PUEDO ";
		lista2[2] = "YO VENGO A ";
		lista2[3] = "VOY A ";
		
		lista3[0] = "ENCENDERTE ";
		lista3[1] = "AMARTE ";
		lista3[2] = "LIGAR ";
		lista3[3] = "JUGAR ";
		
		lista4[0] = "SUAVE ";
		lista4[1] = "LENTO ";
		lista4[2] = "RAPIDO ";
		lista4[3] = "FUERTE ";
		
		lista5[0] = "HASTA QUE SALGA EL SOL ";
		lista5[1] = "TODA LA NOCHE ";
		lista5[2] = "HASTA EL AMANECER ";
		lista5[3] = "TODO EL DIA ";
		
		lista6[0] = "SIN ANESTESIA.";
		lista6[1] = "SIN COMPROMISO.";
		lista6[2] = "FACE TO FACE.";
		lista6[3] = "SIN MIEDO.";
		
		artistas[0] = "Daddy Yankee.";
		artistas[1] = "J Balvin.";
		artistas[2] = "Bad Bunny.";
		artistas[3] = "Nicky Jam.";
		artistas[4] = "Ozuna.";
		artistas[5] = "Wisin y Yandel.";
		artistas[6] = "Don Omar.";
		artistas[7] = "Karol G.";
		artistas[8] = "Farruko.";
		artistas[9] = "Arcangel.";
		}
	
	public String Letra() {
		String cancion = "";
		for(int i=0;i<3;i++) {
			for (int a=0 ;a<4 ;a++) {
				String frase = lista1[(int)(Math.random()*4+0)] + lista2[(int)(Math.random()*4+0)] + lista3[(int)(Math.random()*4+0)] + lista4[(int)(Math.random()*4+0)]+lista5[(int)(Math.random()*4+0)]+lista6[(int)(Math.random()*4+0)]+"\n";
				cancion = cancion + frase;
			}
			cancion+="\n";
		}
		return cancion;
	}
	public String artista() {
		String artista = "";
		artista = artistas[(int)(Math.random()*10+0)];
		return artista;
	}
	public int frases() {
		String cancion = "";
		int frases = 0;
		for(int i=0;i<3;i++) {
			for (int a=0 ;a<4 ;a++) {
				String frase = lista1[(int)(Math.random()*4+0)] + lista2[(int)(Math.random()*4+0)] + lista3[(int)(Math.random()*4+0)] + lista4[(int)(Math.random()*4+0)]+lista5[(int)(Math.random()*4+0)]+lista6[(int)(Math.random()*4+0)]+"\n";
				cancion = cancion + frase;
				frases++;
			}
			cancion+="\n";
		}
		return frases;
	}
	public int estrofas() {
		String cancion = "";
		int estrofas = 0;
		for(int i=0;i<3;i++) {
			for (int a=0 ;a<4 ;a++) {
				String frase = lista1[(int)(Math.random()*4+0)] + lista2[(int)(Math.random()*4+0)] + lista3[(int)(Math.random()*4+0)] + lista4[(int)(Math.random()*4+0)]+lista5[(int)(Math.random()*4+0)]+lista6[(int)(Math.random()*4+0)]+"\n";
				cancion = cancion + frase;
			}
			estrofas++; 
			cancion+="\n";
		}
		return estrofas;
	}
}
