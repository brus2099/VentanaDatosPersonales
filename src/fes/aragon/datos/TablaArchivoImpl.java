package fes.aragon.datos;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TablaArchivoImpl extends AbstractTableModel {
	
	private ArrayList<Datos> datos;
	private String[] nombres={"Nombre","Dato 1","Dato 2"};
	
	public TablaArchivoImpl(String ruta) throws IOException {
		// TODO Auto-generated constructor stub
		Archivo arch=new Archivo(ruta);
		arch.llenarDatos();
		this.datos=arch.getDatos();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.nombres.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.datos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Datos tmp=this.datos.get(rowIndex);
		String celda="";
		if(columnIndex==0){
			celda=tmp.getNombre();
		} else if(columnIndex==1){
			celda=String.valueOf(tmp.getNumeroUno());
		}else {
			celda=String.valueOf(tmp.getNumeroDos());
		}
		
		return celda;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return this.nombres[column];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setValueAt(Object arg0, int row, int column) {
		// TODO Auto-generated method stub
		Datos info=datos.get(row);
		if(column ==0){
			info.setNombre((String)arg0);
		}else{
			if(column==1){
				info.setNumeroUno(Float.parseFloat((String)arg0));
				
			}else if(column==2){
				info.setNumeroDos(Integer.parseInt((String)arg0));
			}
		}
		
		
	}

	public ArrayList<Datos> getDatos() {
		return datos;
	}

	@Override
	public void fireTableDataChanged() {
		// TODO Auto-generated method stub
		super.fireTableDataChanged();
	}
	
	
      
}
