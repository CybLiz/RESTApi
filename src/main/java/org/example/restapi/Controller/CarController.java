package org.example.restapi.Controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import org.example.restapi.Model.Car;
import org.example.restapi.Service.CarService;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class CarController {

    final private CarService carService;

    @Inject
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GET
    @Path("/all")
    public List<Car> getAllCars() {
        return carService.findAll();
    }

    @GET
    @Path("/{id}")
    public Car getCarById(@PathParam("id") UUID id) {
        return carService.findById(id);
    }

    @POST
    public Car createCar(Car car) {
        car.setId(UUID.randomUUID());
        return carService.create(car);
    }

    @PUT
    public Car updateCar(Car car) {
        return carService.update(car);
    }

    @DELETE
    @Path("/{id}")
    public void deleteCar(@PathParam("id") UUID id) {
        carService.delete(id);
    }

}
