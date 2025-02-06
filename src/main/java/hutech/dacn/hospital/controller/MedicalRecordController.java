package hutech.dacn.hospital.controller;

import hutech.dacn.hospital.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/medical")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;
}
