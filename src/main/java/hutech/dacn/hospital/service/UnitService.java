package hutech.dacn.hospital.service;


import hutech.dacn.hospital.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitService {
    @Autowired
    private UnitRepository unitRepository;
}
