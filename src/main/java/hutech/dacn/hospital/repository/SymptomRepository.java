package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SymptomRepository extends JpaRepository<Symptom, String> {
}
