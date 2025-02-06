package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiftService {
    @Autowired
    private ShiftRepository shiftRepository;
}
