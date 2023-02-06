package com.kisrentacar;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller("/cars")
public class CarRentalController {

    @Get
    public List<Car> listCars(@QueryValue(value = "model", defaultValue = "") String type) {
        // Call a service to retrieve a list of available cars from a database or other data source.
        List<Car> cars = retrieveCars(type);
        return cars;
    }

    @Get("/count")
    public int getCarCount() {
        // Call a service to retrieve the total count of cars from a database or other data source.
        int count = retrieveCarCount();
        return count;
    }

    private List<Car> retrieveCars(String type) {
        // Code to retrieve a list of available cars from a database or other data source.
        // For demonstration purposes, this example returns a hardcoded list of cars.
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1, "Toyota Corolla", "Sedan"));
        cars.add(new Car(2, "Honda Civic", "Sedan"));
        cars.add(new Car(3, "Tesla Model 3", "Electric"));

        if (!type.isEmpty()) {
            cars = cars.stream().filter(car -> car.getType().equalsIgnoreCase(type)).collect(Collectors.toList());
        }
        return cars;

    }

    private int retrieveCarCount() {
        // Code to retrieve the total count of cars from a database or other data source.
        // For demonstration purposes, this example returns the size of the hardcoded list of cars.
        List<Car> cars = retrieveCars(null);
        return cars.size();
    }
}