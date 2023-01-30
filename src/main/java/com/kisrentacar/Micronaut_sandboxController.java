package com.kisrentacar;

import io.micronaut.http.annotation.*;

@Controller("/micronaut_sandbox")
public class Micronaut_sandboxController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}