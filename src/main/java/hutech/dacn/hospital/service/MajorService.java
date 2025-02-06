package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorService {
    @Autowired
    private MajorRepository majorRepository;
}
