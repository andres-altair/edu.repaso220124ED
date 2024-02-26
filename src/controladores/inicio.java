package controladores;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class inicio {

	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();
		
		boolean abrir = false;
		int eleccion ;
		
		while (!abrir) 
		{
			eleccion= mi.menu();
			switch (eleccion) 
			{
			case 0:
                System.out.println("cierre de aplicacion");
                abrir = true;
                break;
            case 1:
                System.out.println("VERSIÓN EMPLEADO");
                mi.versionEmpleado();
                
                break;
            case 2:
                System.out.println("VERSIÓN CLIENTE");
                mi.versionCliente();                    
                break;
            default:
                System.out.println("eleccion no reconocida");
                break;
			}
		}
	}
}
