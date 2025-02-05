package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.DiseaseSymptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseSymptomRepository extends JpaRepository<DiseaseSymptom, Long> {
}
