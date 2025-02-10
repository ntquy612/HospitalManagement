package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Symptoms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SymptomRepository extends JpaRepository<Symptoms, String> {
}
