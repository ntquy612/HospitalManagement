package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "AppointmentTime")
public class AppointmentTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentTimeId;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "shiftId")
    private Shift shift;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}
