package com.example.demo;
import org.example.calculadora.SumaRequest;
import org.example.calculadora.SumaResponse;
import org.example.calculadora.RestarResponse;
import org.example.calculadora.RestarRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;;

@Endpoint
public class EndPoint {
	
	//paidLoadRequest -> Contenido de la petición
	//paidLoadResponse -> 
	@PayloadRoot(namespace = "http://www.example.org/calculadora",
			localPart="SumaRequest")
	
	@ResponsePayload
	public SumaResponse getSuma(@RequestPayload SumaRequest peticion) {
		SumaResponse respuesta = new SumaResponse();
		respuesta.setRes(peticion.getIntA() + peticion.getIntB());
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/calculadora",
			localPart="RestarRequest")
	@ResponsePayload
	public RestarResponse getSuma(@RequestPayload RestarRequest peticion) {
		RestarResponse respuesta = new RestarResponse();
		respuesta.setRes(peticion.getIntA() - peticion.getIntB());
		return respuesta;
	}
}
