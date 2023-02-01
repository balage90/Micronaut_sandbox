package com.kisrentacar;

import io.micronaut.http.annotation.*;

@Controller("/start-page")
public class StartPage {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Welcome to Kis Rent a car";
    }
}

