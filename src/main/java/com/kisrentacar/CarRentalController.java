package com.kisrentacar;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.ArrayList;
import java.util.List;

@Controller("/cars")
public class CarRentalController {

    @Get
    public List<Car> listCars() {
        // Call a service to retrieve a list of available cars from a database or other data source.
        List<Car> cars = retrieveCars();
        return cars;
    }

    @Get("/count")
    public int getCarCount() {
        // Call a service to retrieve the total count of cars from a database or other data source.
        int count = retrieveCarCount();
        return count;
    }

    private List<Car> retrieveCars() {
        // Code to retrieve a list of available cars from a database or other data source.
        // For demonstration purposes, this example returns a hardcoded list of cars.
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1, "Toyota Corolla", "Sedan"));
        cars.add(new Car(2, "Honda Civic", "Sedan"));
        cars.add(new Car(3, "Tesla Model 3", "Electric"));

        return cars;
    }

    private int retrieveCarCount() {
        // Code to retrieve the total count of cars from a database or other data source.
        // For demonstration purposes, this example returns the size of the hardcoded list of cars.
        List<Car> cars = retrieveCars();
        return cars.size();
    }
}