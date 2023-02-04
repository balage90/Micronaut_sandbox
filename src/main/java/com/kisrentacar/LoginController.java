package com.kisrentacar;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.*;


@Controller("/login")
public class LoginController {

    @Get(produces = MediaType.TEXT_HTML)
    public HttpResponse showLoginForm() {
        return HttpResponse.ok("<html>" +
                "<body>" +
                "<h1>Login</h1>" +
                "<form action='/login' method='post'>" +
                "<label for='username'>Username:</label>" +
                "<input type='text' id='username' name='username'>" +
                "<br>" +
                "<label for='password'>Password:</label>" +
                "<input type='password' id='password' name='password'>" +
                "<br><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>");
    }

    @Post(consumes = MediaType.APPLICATION_FORM_URLENCODED, produces = MediaType.TEXT_HTML)
    public HttpResponse processLoginForm(String username, String password) {
        if ("admin".equals(username) && "password".equals(password)) {
            return HttpResponse.ok("<html><body><h1>Welcome, " + username + "!</h1></body></html>");
        } else {
            return HttpResponse.ok("<html><body><h1>Login Failed</h1></body></html>");
        }
    }
}