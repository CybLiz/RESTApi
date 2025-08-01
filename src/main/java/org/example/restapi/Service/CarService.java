package org.example.restapi.Service;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;
import org.example.restapi.Model.Car;

import java.time.LocalDate;
import java.util.*;

@ApplicationScoped
public class CarService {
   final private List<Car> cars = new ArrayList<>();

    @PostConstruct
    public void initData() {
        cars.add(new Car(UUID.fromString("aaed2e5f-4110-43ba-9780-a1e333fe8c27"), "Toyota", 25, "Red"));
        cars.add(new Car(UUID.fromString("b5a86179-e18e-4d65-bca4-123456789abc"), "Honda", 23, "Blue"));
        cars.add(new Car(UUID.fromString("c789e5f1-1234-5678-9abc-111111111111"), "Ford", 55, "Black"));
        cars.add(new Car(UUID.fromString("d1111111-2222-3333-4444-555555555555"), "BMW", 15, "White"));
        cars.add(new Car(UUID.fromString("e9999999-8888-7777-6666-555555555555"), "Audi", 14, "Gray"));
    }

    public List<Car> findAll() {
        return cars;
    }

    public Car findById(UUID id) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        throw new NotFoundException("Car not found for id: " + id);
    }

    public Car create(Car car) {
        cars.add(car);
        return car;
    }

    public Car update(Car car) {
        return create(car);
    }


    public void delete(UUID id) {
   cars.removeIf(car -> car.getId().equals(id));

    }

}
