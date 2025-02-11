package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.TestIssueDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestIssueDetailRepository extends JpaRepository<TestIssueDetail, String> {
}
