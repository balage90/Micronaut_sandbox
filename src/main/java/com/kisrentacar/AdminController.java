package com.kisrentacar;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
@Controller("/admin-page")
public class AdminController {
    public HttpResponse index() {
        return HttpResponse.ok("<html><body><h1>Admin Page</h1></body></html>");
    }
}
