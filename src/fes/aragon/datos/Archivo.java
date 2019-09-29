package fes.aragon.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {
	
	private ArrayList<Datos> datos=new ArrayList<>();
	private String ruta="";
	public Archivo() {
		// TODO Auto-generated constructor stub
	}
	public Archivo(String ruta) {
		super();
		this.ruta = ruta;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public ArrayList<Datos> getDatos() {
		return datos;
	}
	
	public void llenarDatos() throws IOException{
		File file=new File(this.ruta);
		if(file.exists()){
			FileReader fr=new FileReader(file);
			BufferedReader buf=new BufferedReader(fr);
			String cad="";
			while((cad=buf.readLine())!=null){
				String [] arg=cad.split(";");
				Datos dat=new Datos();
				dat.setNombre(arg[0]);
				dat.setNumeroUno(Float.parseFloat(arg[1]));
				dat.setNumeroDos(Integer.parseInt(arg[2]));
				this.datos.add(dat);
			}
			
		}else{
			//System.out.println("No existe el archivo");
			new IOException("No existe archivo");
		}
	}
}

