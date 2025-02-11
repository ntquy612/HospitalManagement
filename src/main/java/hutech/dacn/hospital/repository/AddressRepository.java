package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

    @Query(value = "SELECT * FROM Address WHERE City = :city", nativeQuery = true)
    List<Address> findByCity(@Param("city") String city);
}
