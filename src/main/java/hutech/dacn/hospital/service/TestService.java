package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;
}
