package com.kisrentacar;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;


@Controller("/")
public class StartPage {

    @Get(produces = MediaType.TEXT_HTML)
    public HttpResponse showLoginForm() {
        return HttpResponse.ok(
                "<html>\n" +
                        "<head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <title>KisRentaCar</title>\n" +
                        "  <style>\n" +
                        "    body {\n" +
                        "      font-family: Arial, sans-serif;\n" +
                        "      text-align: center;\n" +
                        "    }\n" +
                        "    h1 {\n" +
                        "      color: #006699;\n" +
                        "      font-size: 36px;\n" +
                        "      margin-bottom: 40px;\n" +
                        "    }\n" +
                        "    a {\n" +
                        "      background-color: #006699;\n" +
                        "      color: white;\n" +
                        "      padding: 15px 20px;\n" +
                        "      text-decoration: none;\n" +
                        "    }\n" +
                        "  </style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <h1>Welcome to KisRentaCar</h1>\n" +
                        "  <p>We offer a wide range of cars for rent at affordable prices.</p>\n" +
                        "  <a href=\"/cars\">See our cars</a>\n" +
                        "</body>\n" +
                        "</html>");
    }


    private boolean pageExists(String page) {
        // Check if the page exists
        return false;
    }

    private String getContent(String page) {
        // Return the content of the page
        return "";
    }
}

