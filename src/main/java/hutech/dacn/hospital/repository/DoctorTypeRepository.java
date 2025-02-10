package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.DoctorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorTypeRepository extends JpaRepository<DoctorType, String> {
}
