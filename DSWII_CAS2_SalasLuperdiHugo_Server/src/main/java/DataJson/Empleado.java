package DataJson;

import com.google.gson.annotations.SerializedName;

public class Empleado {
	
	@SerializedName("Codigo")
	private int idempleado;
	
	@SerializedName("Nombre Compuesto")
	private String nombre;
	
	@SerializedName("Apellidos Completos")
	private String apellido;
	
	@SerializedName("Email")
	private String email;
	
	@SerializedName("Nro de Documento")
	private String dni;
	
	@SerializedName("Telefono/Celular")
	private String telef;

	public Empleado() {

	}

	public Empleado(int idempleado, String nombre, String apellido, String email, String dni, String telef) {
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.telef = telef;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelef() {
		return telef;
	}

	public void setTelef(String telef) {
		this.telef = telef;
	}

	@Override
	public String toString() {
		return "Empleado [idempleado=" + idempleado + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", dni=" + dni + ", telef=" + telef + "]";
	}

}
