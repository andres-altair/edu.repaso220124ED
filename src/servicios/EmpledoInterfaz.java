package servicios;

import java.util.List;

import dtos.ClienteDto;

public interface EmpledoInterfaz {
	public void validarCliente(List<ClienteDto> cliente);
	public void borradoCliente (List<ClienteDto> cliente);
	public void mostrarCliente(List<ClienteDto> cliente);
}
