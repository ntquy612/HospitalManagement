package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    private String roomName;

    @ManyToOne
    @JoinColumn(name = "floorId")
    private Floor floor;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}

