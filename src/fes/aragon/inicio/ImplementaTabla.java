package fes.aragon.inicio;
import javax.swing.table.*;

public class ImplementaTabla extends AbstractTableModel  {
	private String [][] matriz ={{"A1","A2","A3"},{"B1","B2","B3"}};
	private String[] nombre={"C1","C2","C3"};
	

	
	@Override
	public String getColumnName(int coloumn) {
		// TODO Auto-generated method stub
		return nombre[coloumn];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return matriz[0].length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return matriz.length;
	}

	@Override
	public Object getValueAt(int row, int coloumn) {
		String celda=matriz[row][coloumn];
		// TODO Auto-generated method stub
		return celda;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setValueAt(Object data, int arg1, int arg2) {
		// TODO Auto-generated method stub
		String con=(String)data;
		matriz[arg1][arg2]=con;
		
	}
	
	

}
