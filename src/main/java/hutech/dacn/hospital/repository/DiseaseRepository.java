package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Long> {
}
