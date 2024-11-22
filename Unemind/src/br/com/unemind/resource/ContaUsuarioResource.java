package br.com.unemind.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.unemind.bean.ContaUsuario;
import br.com.unemind.bo.ContaUsuarioBo;
@Path("/contaUsuario")
public class ContaUsuarioResource {
	
	private ContaUsuarioBo contaUsuarioBo;
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ContaUsuario usuario, @Context UriInfo uriInfo) throws SQLException {
		contaUsuarioBo.cadastrar(usuario);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(usuario.getCodigoUsuario()));
		return Response.created(builder.build()).build();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar() {
		return "Oi";
	}
}
