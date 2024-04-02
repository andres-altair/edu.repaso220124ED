package dtos;

public class ClienteDto {
	long id ;
	String dni = "aaaaaaaaaaaaaa";
	String nombreCompleto = "aaaaaaaaaa";
	String nombre  = "aaaa";
	String apellido1 = "aaaaa";
	String apellido2 = "aaaaaaa";
	String email = "aaaaaa";
	String contrasenia = "aaaaaaa";
	boolean validar = false;
	
	//getter setter
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public boolean isValidar() {
		return validar;
	}
	public void setValidar(boolean validar) {
		this.validar = validar;
	}
		
	//constructores
	public ClienteDto() {}
	public ClienteDto(long id, String nombreCompleto,String dni,String email, String contrasenia) 
	{
		this.id = id;
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		String[] nombreArray  = nombreCompleto.split(" "); 
		this.nombre = nombreArray[0];
		this.apellido1 = nombreArray[1];
		this.apellido2 = nombreArray[2];
		this.email = email;
		this.contrasenia = contrasenia;
	}
	
}
