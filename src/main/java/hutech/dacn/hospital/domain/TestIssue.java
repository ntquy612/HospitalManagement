package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TestIssue")
public class TestIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testIssueId;

    @ManyToOne
    @JoinColumn(name = "testId")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "medicalRecordId")
    private MedicalRecord medicalRecord;

    private String status;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}
