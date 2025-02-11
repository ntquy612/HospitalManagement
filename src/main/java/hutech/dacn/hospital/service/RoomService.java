package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Room;
import hutech.dacn.hospital.repository.FloorRepository;
import hutech.dacn.hospital.repository.RoomRepository;
import hutech.dacn.hospital.request.CreateRoomRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private FloorRepository floorRepository;

    public boolean save(CreateRoomRequest request) {
        Room room = new Room();
//        room.setRoomID(customRoomId);
        room.setRoomName(request.getRoomName());
        room.setFloor(floorRepository.getByFloorId(request.getFloorId()));
        room.setCreateDate(LocalDateTime.now());
        room.setCreateUser(request.getCreateUser());
        roomRepository.save(room);
        return true;
    }

    public Room getByRoomId(String roomId) {
        return roomRepository.getByRoomId(roomId);
    }

    public List<Room> getByFloorId(String floorId) {
        return roomRepository.getByFloorId(floorId);
    }
}
