package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiseaseService {
    @Autowired
    private DiseaseRepository diseaseRepository;

}
