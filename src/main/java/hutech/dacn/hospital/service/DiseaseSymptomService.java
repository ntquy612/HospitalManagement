package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.DiseaseSymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiseaseSymptomService {
    @Autowired
    private DiseaseSymptomRepository diseaseSymptomRepository;

}
