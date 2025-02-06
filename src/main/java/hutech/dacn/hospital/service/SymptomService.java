package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SymptomService {
    @Autowired
    private SymptomRepository symptomRepository;
}
