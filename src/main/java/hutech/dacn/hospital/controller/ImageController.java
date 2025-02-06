package hutech.dacn.hospital.controller;

import hutech.dacn.hospital.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
}
