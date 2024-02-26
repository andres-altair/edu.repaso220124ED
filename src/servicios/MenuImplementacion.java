package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class MenuImplementacion implements MenuInterfaz 
{
	
	List<ClienteDto> cliente = new ArrayList<ClienteDto>();
	Scanner sc = new Scanner(System.in);
	@Override
	public int menu() 
	{
		System.out.println("0. cerrar aplicacion");
		System.out.println("1. entrar en modo empleado");
		System.out.println("2. entrar en modo cliente");
		int resultado = sc.nextInt();
		return resultado;
	}

	@Override
	public void versionEmpleado() 
	{
		EmpledoInterfaz ei = new EmpleadoImplementacion();
		int eleccionEmpleado= menuEmpleado();
		switch (eleccionEmpleado) 
		{
			case 0 : 
				break;
			case 1 : ei.validarCliente(cliente);
				break;
			case 2 : ei.borradoCliente(cliente);
		       break;
			case 3 : ei.mostrarCliente(cliente);
		       break;
			default:
                System.out.println("eleccion no reconocida");
                break;	
		}	
	}

	private int menuEmpleado() 
	{
		System.out.println("0. Volver");
	    System.out.println("1. Validar cliente");
	    System.out.println("2. Borrar cliente");
	    System.out.println("3. Mostrar clientes");
		int resultado = sc.nextInt();
		return resultado;
	}
	
	
	
	@Override
	public void versionCliente() 
	{
		ClienteInterfaz ci = new ClienteImplementacion();
		int eleccion = menuCliente();
		switch (eleccion) 
		{
			case 0 : 
				break;
			case 1 : ci.registroCliente(cliente);
				break;
			case 2 : ci.accesoCliente(cliente);
				break;
			default :
				System.out.println("eleccion no reconocida");
				break;
		}
		
	}

	private int  menuCliente () 
	{
		System.out.println("0. Volver");
        System.out.println("1. Registro cliente");
        System.out.println("2. Acceso cliente (login)");
        System.out.println("Escriba la opción deseada: ");
        int resultado = sc.nextInt();
		return resultado;
	}
}
