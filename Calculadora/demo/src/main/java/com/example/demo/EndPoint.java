package com.example.demo;
import org.example.calculadora.SumaRequest;
import org.example.calculadora.SumaResponse;
import org.example.calculadora.RestarResponse;
import org.example.calculadora.RestarRequest;
import org.example.calculadora.MultiplicacionResponse;
import org.example.calculadora.MultiplicacionRequest;
import org.example.calculadora.DividirResponse;
import org.example.calculadora.DividirRequest;
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
	
	@PayloadRoot(namespace = "http://www.example.org/calculadora",
			localPart="MultiplicacionRequest")
	@ResponsePayload
	public MultiplicacionResponse getSuma(@RequestPayload MultiplicacionRequest peticion) {
		MultiplicacionResponse respuesta = new MultiplicacionResponse();
		respuesta.setRes(peticion.getIntA() * peticion.getIntB());
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/calculadora",
			localPart="DividirRequest")
	@ResponsePayload
	public DividirResponse getSuma(@RequestPayload DividirRequest peticion) {
		DividirResponse respuesta = new DividirResponse();
		respuesta.setRes(peticion.getIntA() / peticion.getIntB());
		return respuesta;
	}

}
