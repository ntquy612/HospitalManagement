package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, String> {

    Optional<Shift> getByShiftId(String shiftId);
}
