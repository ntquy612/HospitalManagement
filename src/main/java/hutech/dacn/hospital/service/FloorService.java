package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FloorService {
    @Autowired
    private FloorRepository floorRepository;
}
