package com.ironhack.hellomotor.dev;

import com.ironhack.hellomotor.model.Airplane;
import com.ironhack.hellomotor.model.Car;
import com.ironhack.hellomotor.model.CarType;
import com.ironhack.hellomotor.model.Vehicle;
import com.ironhack.hellomotor.repository.CarRepository;
import com.ironhack.hellomotor.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
@RequiredArgsConstructor
public class DatabaseLoader implements ApplicationListener<ApplicationReadyEvent> {

    private final VehicleRepository vehicleRepository;
    private final CarRepository carRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        var faker = new Faker();
        for (int i = 0; i < 3; i++) {
            var vehicle1= new Vehicle(faker.familyGuy().character(), faker.marketing().buzzwords(), faker.random().nextInt(1990, 2023));
            var car1= new Car(faker.familyGuy().character(), faker.mountain().name(), faker.random().nextInt(1990, 2023), faker.random().nextInt(1, 7), (faker.random().nextInt() % 2 == 0) ? CarType.FAMILY : CarType.SPORT);
            var airplane1 = new Airplane(faker.starCraft().character(), faker.animal().name(), faker.random().nextInt(1990,2023), faker.random().nextInt(100, 140));
//            vehicleRepository.save(vehicle1);
            carRepository.save(car1);
            vehicleRepository.save(airplane1);

            System.out.println("print all vehicles");
            vehicleRepository.findAll().forEach(System.out::println);
//
            System.out.println("printing airplanes");
//            vehicleRepository.findAllAirplane().forEach(System.out::println);
            System.out.println("printing cars");
            carRepository.findAll().forEach(System.out::println);
            carRepository.findAllByType(CarType.SPORT).forEach(System.out::println);
        }
    }
}
