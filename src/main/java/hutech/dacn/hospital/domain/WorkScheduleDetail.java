package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "WorkScheduleDetail")
public class WorkScheduleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workScheduleDetailId;

    @ManyToOne
    @JoinColumn(name = "workScheduleId")
    private WorkSchedule workSchedule;

    @ManyToOne
    @JoinColumn(name = "doctorId")
    private Doctor doctor;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

// Getters and sett
}