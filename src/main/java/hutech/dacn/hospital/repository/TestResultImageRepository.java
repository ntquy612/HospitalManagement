package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.TestResultImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultImageRepository extends JpaRepository<TestResultImage, String> {
}
