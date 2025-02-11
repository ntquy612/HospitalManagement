package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Doctor;
import hutech.dacn.hospital.repository.DoctorRepository;
import hutech.dacn.hospital.request.CreateDoctorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

   /* @Autowired
    private DoctorType

    public boolean create(CreateDoctorRequest request) {
        Doctor doctor = new Doctor();
        doctor.setDoctorID(customDoctorId);
        doctor.setDoctorType(request.getDoctorTypeId());
    }*/
}
