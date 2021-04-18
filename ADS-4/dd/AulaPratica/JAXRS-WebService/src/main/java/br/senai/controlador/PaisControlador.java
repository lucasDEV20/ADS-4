package br.senai.controlador;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.senai.modelo.Pais;
import br.senai.service.PaisService;

@Path("/paises")
public class PaisControlador {

	PaisService paisService = new PaisService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getCountries() {
		List listOfCountries = paisService.getAllCountries();
		return listOfCountries;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pais getPaisById(@PathParam("id") int id) {
		return paisService.getPais(id);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Pais addPais(Pais Pais) {
		return paisService.addPais(Pais);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Pais updatePais(Pais Pais) {
		return paisService.updatePais(Pais);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deletePais(@PathParam("id") int id) {
		paisService.deletePais(id);
	}
}
