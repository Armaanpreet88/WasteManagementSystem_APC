package com.waste.waste_management.service;

import com.waste.waste_management.domain.Vehicle;
import com.waste.waste_management.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    // Create or Update Vehicle
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    // Get all Vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Get Vehicle by ID
    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }

    // Delete Vehicle
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    // Find Vehicle by vehicle number
    public Optional<Vehicle> getByVehicleNumber(String vehicleNumber) {
        return vehicleRepository.findByVehicleNumber(vehicleNumber);
    }
}
