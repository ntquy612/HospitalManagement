package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
