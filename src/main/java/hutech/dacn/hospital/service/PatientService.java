package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Patient;
import hutech.dacn.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient getByPatientId(String patientId) {
        return patientRepository.getByPatientID(patientId);
    }

//    public Patient getByAccountId(String accountId) {
//        return patientRepository.getByAccountId(accountId);
//    }

    public List<Patient> get() {
        return patientRepository.findAll();
    }
}
