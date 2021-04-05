package com.example.demo;
import org.example.torneo.EditarEquipoRequest;
import org.example.torneo.EditarEquipoResponse;
import org.example.torneo.EditarJugadorRequest;
import org.example.torneo.EditarJugadorResponse;
import org.example.torneo.EliminarEquipoRequest;
import org.example.torneo.EliminarEquipoResponse;
import org.example.torneo.EliminarJugadorRequest;
import org.example.torneo.EliminarJugadorResponse;
import org.example.torneo.EquipoRequest;
import org.example.torneo.EquipoResponse;
import org.example.torneo.JugadorRequest;
import org.example.torneo.JugadorResponse;
import org.example.torneo.MostrarEquipoRequest;
import org.example.torneo.MostrarEquipoResponse;
import org.example.torneo.MostrarJugadorRequest;
import org.example.torneo.MostrarJugadorResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndPoint{
    //Registro jugador
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="JugadorRequest")
    
    @ResponsePayload
    public JugadorResponse getJugador(@RequestPayload JugadorRequest peticion){
        JugadorResponse respuesta = new JugadorResponse();
        respuesta.setRespuesta("Registrado "+peticion.getNombre());
		return respuesta;
    }

    //Editar jugador
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="EditarJugadorRequest")
    
    @ResponsePayload
    public EditarJugadorResponse getModificarJugador(@RequestPayload EditarJugadorRequest peticion){
        EditarJugadorResponse respuesta = new EditarJugadorResponse();
        respuesta.setRespuesta("Editado "+peticion.getNombre());
		return respuesta;
    }

    //Eliminar jugador
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="EliminarJugadorRequest")
    
    @ResponsePayload
    public EliminarJugadorResponse getEliminarJugador(@RequestPayload EliminarJugadorRequest peticion){
        EliminarJugadorResponse respuesta = new EliminarJugadorResponse();
        respuesta.setRespuesta(peticion.getNombre() + "Eliminado");
		return respuesta;
    }

    //Mostrar jugador
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="MostrarJugadorRequest")
    
    @ResponsePayload
    public MostrarJugadorResponse getListaJugador(@RequestPayload MostrarJugadorRequest peticion){
        MostrarJugadorResponse respuesta = new MostrarJugadorResponse();
        respuesta.setRespuesta("lista de jugadores");
		return respuesta;
    }

    //Registro equipo
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="EquipoRequest")
    
    @ResponsePayload
    public EquipoResponse getEquipo(@RequestPayload EquipoRequest peticion){
        EquipoResponse respuesta = new EquipoResponse();
        respuesta.setRespuesta("Registrado "+peticion.getNombre());
		return respuesta;
    }

    //Modificar equipo
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="EditarEquipoRequest")
    
    @ResponsePayload
    public EditarEquipoResponse getModificarEquipo(@RequestPayload EditarEquipoRequest peticion){
        EditarEquipoResponse respuesta = new EditarEquipoResponse();
        respuesta.setRespuesta("Modificado "+peticion.getNombre());
		return respuesta;
    }

    //Eliminar equipo
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="EliminarEquipoRequest")
    
    @ResponsePayload
    public EliminarEquipoResponse getEliminarJugador(@RequestPayload EliminarEquipoRequest peticion){
        EliminarEquipoResponse respuesta = new EliminarEquipoResponse();
        respuesta.setRespuesta(peticion.getNombre() + "Eliminado");
		return respuesta;
    }

    //Mostrar jugador
    @PayloadRoot(namespace="http://www.example.org/torneo", 
    localPart="MostrarEquipoRequest")
    
    @ResponsePayload
    public MostrarEquipoResponse getListaJugador(@RequestPayload MostrarEquipoRequest peticion){
        MostrarEquipoResponse respuesta = new MostrarEquipoResponse();
        respuesta.setRespuesta("lista de equipos");
		return respuesta;
    }
}
