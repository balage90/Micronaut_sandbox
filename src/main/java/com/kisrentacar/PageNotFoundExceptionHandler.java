package com.kisrentacar;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;



@Produces

@Requires(classes = {PageNotFoundException.class, ExceptionHandler.class})
public class PageNotFoundExceptionHandler implements ExceptionHandler<PageNotFoundException, HttpResponse> {

    @Override
    public HttpResponse handle(HttpRequest request, PageNotFoundException exception) {
        return HttpResponse.notFound();
    }
}