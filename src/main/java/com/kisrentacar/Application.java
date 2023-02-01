package com.kisrentacar;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "Micronaut_sandbox",
            version = "0.0"
    )
)
public class Application {

    public static void main(String[] args) {

        Users user = new Users();
        user.setFirstName("Kovács");
        user.setLastName("Balázs");
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());

        Micronaut.run(Application.class, args);
    }
}