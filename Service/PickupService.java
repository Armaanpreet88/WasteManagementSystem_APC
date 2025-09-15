package com.waste.waste_management.service;

import com.waste.waste_management.domain.Pickup;
import com.waste.waste_management.repository.PickupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PickupService {

    private final PickupRepository pickupRepository;

    // Create or Update Pickup
    public Pickup savePickup(Pickup pickup) {
        return pickupRepository.save(pickup);
    }

    // Get all Pickups
    public List<Pickup> getAllPickups() {
        return pickupRepository.findAll();
    }

    // Get Pickup by ID
    public Optional<Pickup> getPickupById(Long id) {
        return pickupRepository.findById(id);
    }

    // Delete Pickup
    public void deletePickup(Long id) {
        pickupRepository.deleteById(id);
    }

    // Find Pickups by Area
    public List<Pickup> getPickupsByArea(Long areaId) {
        return pickupRepository.findByAreaId(areaId);
    }

    // Find completed or pending Pickups
    public List<Pickup> getPickupsByCompletionStatus(boolean completed) {
        return pickupRepository.findByCompleted(completed);
    }
}
