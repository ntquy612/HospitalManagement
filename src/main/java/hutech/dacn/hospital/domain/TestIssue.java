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

    public Long getTestIssueId() {
        return testIssueId;
    }

    public void setTestIssueId(Long testIssueId) {
        this.testIssueId = testIssueId;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
