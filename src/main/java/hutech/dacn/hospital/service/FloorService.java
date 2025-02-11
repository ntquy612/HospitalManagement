package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Floor;
import hutech.dacn.hospital.repository.FloorRepository;
import hutech.dacn.hospital.request.CreateFloorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FloorService {
    @Autowired
    private FloorRepository floorRepository;

    public boolean createFloor(CreateFloorRequest request) {
        Floor floor = new Floor();
        floor.setFloorName(request.getFloorName());
        floor.setCreateDate(LocalDateTime.now());
        floor.setCreateUser(request.getAccountId());
        if(floorRepository.save(floor) != null) {
            return true;
        }
        return false;
    }
}
