package com.waste.waste_management.service;

import com.waste.waste_management.domain.Area;
import com.waste.waste_management.repository.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AreaService {

    private final AreaRepository areaRepository;

    // Create or Update Area
    public Area saveArea(Area area) {
        return areaRepository.save(area);
    }

    // Get all Areas
    public List<Area> getAllAreas() {
        return areaRepository.findAll();
    }

    // Get Area by ID
    public Optional<Area> getAreaById(Long id) {
        return areaRepository.findById(id);
    }

    // Delete Area
    public void deleteArea(Long id) {
        areaRepository.deleteById(id);
    }
}
