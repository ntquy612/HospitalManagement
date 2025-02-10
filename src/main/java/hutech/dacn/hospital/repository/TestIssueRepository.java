package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.TestIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestIssueRepository extends JpaRepository<TestIssue, String> {
}
