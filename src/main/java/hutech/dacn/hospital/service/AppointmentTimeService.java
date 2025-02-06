package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.AppointmentTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentTimeService {
    @Autowired
    private AppointmentTimeRepository appointmentTimeRepository;

}
