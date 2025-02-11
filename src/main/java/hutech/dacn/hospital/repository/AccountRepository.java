package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> getByUsername(String username);

    Account getByUsernameV2(String username);

    Optional<Account> getByAccountId(String id);

    @Query(value = "select AutoIDAccount(:type)", nativeQuery = true)
    String autoId(@Param("type") String type);

    @Query(value = "select * from Account", nativeQuery = true)
    List<Account> getList();

}
