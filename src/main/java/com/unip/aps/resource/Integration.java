package com.unip.aps.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.unip.aps.controller.CalculoFacede;
import com.unip.aps.entity.ItemEntity;


@Path("/calculo")
public class Integration {
	
	private CalculoFacede calculoJson = new CalculoFacede();
	private ItemEntity item = new ItemEntity();
	private ItemEntity itemCalculado = new ItemEntity();
	
	@GET
	@Path("/ping")
	@Produces(value = "application/json")
	public Response getStatus() {
		return Response.ok().status(Response.Status.OK).entity("{\"retorno\":\"pong\"}").build();
	}
	
	  @POST
	   @Path("/calcular")
	   @Produces("application/json")
	   @Consumes("application/json")
	   public Response ja(String json){
		  	System.out.println(json);
	        try {

	           Gson gson = new Gson();
	           gson.toJson(json);
	           item = gson.fromJson(json, ItemEntity.class);
	           
	           itemCalculado = calculoJson.calcularValores(item);
	           
	           String response = "Valor total: " + itemCalculado.getTotal();
	           
	        	return Response.ok().status(Response.Status.OK).entity(response).build();
	        	
	        } catch (Exception ex) {
	        	return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).entity("{\"retorno\":\"Deu ruim\"}").build();
	    }


}



}
