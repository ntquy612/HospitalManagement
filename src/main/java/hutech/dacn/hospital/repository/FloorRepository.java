package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends JpaRepository<Floor, String> {
    Floor getByFloorID(String floorId);
}
