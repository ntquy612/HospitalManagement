package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String gender;
    private String phone;
    private String email;
    private String identityIdentification;

    @ManyToOne
    @JoinColumn(name = "majorId")
    private Major major;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<WorkScheduleDetail> workScheduleDetails;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}

