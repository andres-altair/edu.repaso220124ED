package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;

public class EmpleadoImplementacion implements EmpledoInterfaz 
{
	Scanner sc = new Scanner(System.in);
	@Override
	public void validarCliente(List<ClienteDto> cliente) 
	{
		System.out.println("CLIENTES NO VALIDADOS");
        List<ClienteDto> listaAuxiliar = new ArrayList<ClienteDto>();

       for (ClienteDto c : cliente) 
       {
    	   if (c.isValidar() == false) 
    	   {
    		   System.out.println("\\\\\\\\\\\\\\\\\\\\");
               System.out.println("DNI: " + c.getDni());
               System.out.println("NOMBRE: " + c.getNombreCompleto());
               System.out.println("\\\\\\\\\\\\\\\\\\\\");
    	   }
       }
       if(cliente.size()>0) {
    	   System.out.println("escribe el dni a validar");
    	   String dniValidar = sc.next();   	   
    	   for(ClienteDto c : cliente ) 
    	   {
    		   if (c.getDni().equals(dniValidar))
    		   {
    			   c.setValidar(true);
    			   System.out.println("El cliente con dni " + dniValidar + " ha sido validado");
    		   }
    	   }    	   
       }
	}

	@Override
	public void borradoCliente(List<ClienteDto> cliente) 
	{
		if(cliente.size()>0) 
		{
		 System.out.println("escribe el dni a eliminar");
		 String dniEliminar = sc.next();
  	   	ClienteDto cli = new ClienteDto(); 
		  for (ClienteDto c : cliente) 
		  {
			  if (c.getDni().equals(dniEliminar)) 
			  {
				  cli = c;
			  }
		  }
		  cliente.remove(cli);
		}
	}

	@Override
	public void mostrarCliente(List<ClienteDto> cliente) 
	{
		for ( ClienteDto c : cliente) 
		{
			 System.out.println("%%%%%%%%%%");
	         System.out.println("DNI: " + c.getDni());
	         System.out.println("NOMBRE: " + c.getApellido1() + " " + c.getApellido2() + ", " + c.getNombre());
	         String validado;
	         if (c.isValidar()== true) {
	        	 validado = "si";
	            }
	            else
	            {
	                validado = "no";
	            }	         
	         System.out.println("ESTADO VALIDACIÓN: " + validado);
	         System.out.println("%%%%%%%%%%");
		}		
	}
}
