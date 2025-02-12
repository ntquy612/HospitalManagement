package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, String> {
}
