package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz 
{
	Scanner sc = new Scanner(System.in);
	@Override
	public void registroCliente(List<ClienteDto> cliente) 
	{
		long id = crearId(cliente);
		System.out.println("Indique el nombre completo separado por espacios");
        String nombreConEspacios = sc.nextLine();
        System.out.println("dni: ");
        String dni = sc.next();	
		System.out.println("email: "); 
		String email = sc.next();
		System.out.println(" contraseña: "); 
		String contrasenia = sc.next();
		
		ClienteDto nuevoCliente  = new ClienteDto(id,nombreConEspacios,dni,email,contrasenia);
		cliente.add(nuevoCliente);
		
	}
	
	private long crearId (List<ClienteDto> cliente) 
	{
		long id;
		int tamaniolista = cliente.size();
		if(cliente.size()==0) 
		{
			id= 1;
		}
		else 
		{
			id = cliente.get(tamaniolista-1).getId()+1;
		}
		return id;
	}
	
	@Override
	public void accesoCliente(List<ClienteDto> cliente) 
	{
		if(cliente.size()>0) 
		{
			System.out.println("email");
			String email =sc.next();
			System.out.println("contrasenia");
			String contrasenia = sc.next();
			for (ClienteDto c : cliente) 
			{
				if(c.getEmail().equals(email) && c.getContrasenia().equals(contrasenia) && c.isValidar()==true) {
					
					System.out.println("INICIO DE SESIÓN CORRECTO");					
				}else 
				{
					System.out.println("ERROR EN INICIO DE SESIÓN");
				}
			}
		}
	}
}
