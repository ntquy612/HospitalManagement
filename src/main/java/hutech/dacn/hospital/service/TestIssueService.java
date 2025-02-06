package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.TestIssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestIssueService {
    @Autowired
    private TestIssueRepository testIssueRepository;
}
