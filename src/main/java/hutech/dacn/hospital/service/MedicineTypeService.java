package hutech.dacn.hospital.service;

import hutech.dacn.hospital.repository.MedicineTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicineTypeService {
    @Autowired
    private MedicineTypeRepository medicineTypeRepository;
}
