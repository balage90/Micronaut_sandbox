package com.kisrentacar;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.*;
import jakarta.inject.Inject;

import javax.validation.ValidationException;
import javax.validation.constraints.NotBlank;

@Controller("/register")
@Validated
public class RegistrationController {
    private final UserRepository userRepository;

    @Inject
    public RegistrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Get(produces = MediaType.TEXT_HTML)
    public HttpResponse showRegistrationForm() {
        return HttpResponse.ok("<html><body>" +
                "<form action='/register' method='post'>" +
                "Username: <input type='text' name='username'><br>" +
                "Password: <input type='password' name='password'><br>" +
                "Email: <input type='email' name='email'><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body></html>");
    }

    @Post(consumes = MediaType.APPLICATION_FORM_URLENCODED, produces = MediaType.TEXT_HTML)
    public HttpResponse processRegistrationForm(@NotBlank String username,
                                                @NotBlank String password,
                                                @NotBlank String email) {
        User user = new User(username, password, email);
        try {
            userRepository.save(user);
            return HttpResponse.ok("<html><body><h1>Registration Successful</h1></body></html>");
        } catch (ValidationException e) {
            return HttpResponse.badRequest("<html><body><h1>Registration Failed</h1></body></html>");
        }
    }
}