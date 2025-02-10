package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.MedicalSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends JpaRepository<MedicalSpecialty, Long> {
}
