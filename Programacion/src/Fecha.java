
public class Fecha {
	private int dia;
	private int anio;
	private int mes;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", anio=" + anio + ", mes=" + mes + "]";
	}
	
	/*public void imprimir() {
		System.out.println("Dia: "+dia+"Mes: "+mes+"Año: "+anio);
		
	*/
	

}
