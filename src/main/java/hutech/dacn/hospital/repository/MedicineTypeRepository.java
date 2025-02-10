package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.MedicineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineTypeRepository extends JpaRepository<MedicineType, String> {
}
