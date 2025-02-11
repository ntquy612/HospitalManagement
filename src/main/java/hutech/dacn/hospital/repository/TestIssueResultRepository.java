package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.TestIssueResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestIssueResultRepository extends JpaRepository<TestIssueResult, String> {
}
