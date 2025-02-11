package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {

    Room getByRoomId(String roomId);

    List<Room> getByFloorId(String floorId);
}
