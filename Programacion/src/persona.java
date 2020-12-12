
public class persona {

	private String cedula;
	private String nombre;
	private double estatura_me;
	
	//constructor vacio de mi clase
	
	public persona() {
		
	}
//defino constructor con datos y el deafult desaparece
	
	public persona(String cedula, String nombre, double estatura_me) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.estatura_me = estatura_me;
	}


	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getEstatura_me() {
		return estatura_me;
	}
	public void setEstatura_me(double estatura_me) {
		this.estatura_me = estatura_me;
	}

	@Override
	public String toString() {
		return "persona [cedula=" + cedula + ", nombre=" + nombre + ", estatura_me=" + estatura_me + "]";
	}
	
	
}
