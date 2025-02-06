package hutech.dacn.hospital.controller;

import hutech.dacn.hospital.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @Autowired
    private TestService testService;
}
