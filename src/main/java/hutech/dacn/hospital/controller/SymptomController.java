package hutech.dacn.hospital.controller;

import hutech.dacn.hospital.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/symptom")
public class SymptomController {
    @Autowired
    private SymptomService symptomService;

}
