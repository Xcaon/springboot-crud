package com.andres.curso.springboot.app.springbootcrud.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


// Cuando guardas o envías un objeto de usuario autenticado 
// como JSON (por ejemplo, en un token JWT o en una respuesta), Spring/Jackson necesita saber cómo serializar y deserializar estas autoridades.
public abstract class SimpleGrantedAuthorityJsonCreator {

    @JsonCreator
    public SimpleGrantedAuthorityJsonCreator(@JsonProperty("authority") String role){}
}
