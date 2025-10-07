package com.andres.curso.springboot.app.springbootcrud.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

// Este Constraint significa que delega de la clase Original
@Constraint(validatedBy = IsExistsDbValidation.class)
@Target(ElementType.FIELD) // A que afecta
@Retention(RetentionPolicy.RUNTIME) // significa que estará disponible en tiempo de ejecución
public @interface IsExistsDb {
    String message() default "ya existe en la base de datos!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
