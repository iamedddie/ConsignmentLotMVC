package com.lot.service;


import com.lot.model.Vehicle;
import com.lot.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private VehicleRepository repository;

    @Override
    public List<Vehicle> findAllVehicles() {
        List<Vehicle> vehicles= new ArrayList<>();
        Iterable<Vehicle> vehicleItr= repository.findAll();
        vehicleItr.forEach(vehicles::add);
        return vehicles;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }



}
