package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Shift;
import hutech.dacn.hospital.repository.ShiftRepository;
import hutech.dacn.hospital.request.CreateShiftRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ShiftService {
    @Autowired
    private ShiftRepository shiftRepository;

    public boolean create(CreateShiftRequest request) {
        Shift shift = new Shift();
//        shift.setShiftID(customShiftId);
        shift.setShiftName(request.getShiftName());
        shift.setCreateUser(request.getCreateUser());
        shift.setCreateDate(LocalDateTime.now());
        shift.setStartTime(request.getStartTime());
        shift.setEndTime(request.getEndTime());
        shiftRepository.save(shift);
        return true;
    }

    public Shift getById(String shiftId) {
        Optional<Shift> shift = shiftRepository.getByShiftID(shiftId);
        return shift.orElse(null);
    }
}
