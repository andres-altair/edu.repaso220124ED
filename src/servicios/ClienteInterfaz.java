package servicios;

import java.util.List;

import dtos.ClienteDto;

public interface ClienteInterfaz {
	public void registroCliente(List<ClienteDto> cliente);
	public void accesoCliente(List<ClienteDto> cliente);
}
