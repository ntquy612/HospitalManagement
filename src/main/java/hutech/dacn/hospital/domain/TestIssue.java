package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TestIssue")
public class TestIssue {
    @Id
    @Column(name = "TestIssuesID", length = 30)
    private String testIssuesID;

    @ManyToOne
    @JoinColumn(name = "MedicalRecordID", referencedColumnName = "MedicalRecordID")
    private MedicalRecordDetail medicalRecordID;

    @ManyToOne
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    private MedicalRecordDetail doctorID;

    @Column(name = "Date")
    private  Date date;

    @Column(name = "Status", length = 30)
    private  String status;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "testIssue")
    private List<TestIssueDetail> testIssueDetails;

    public List<TestIssueDetail> getTestIssueDetails() {
        return testIssueDetails;
    }

    public void setTestIssueDetails(List<TestIssueDetail> testIssueDetails) {
        this.testIssueDetails = testIssueDetails;
    }

    public String getTestIssuesID() {
        return testIssuesID;
    }

    public void setTestIssuesID(String testIssuesID) {
        this.testIssuesID = testIssuesID;
    }

    public MedicalRecordDetail getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(MedicalRecordDetail medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public MedicalRecordDetail getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(MedicalRecordDetail doctorID) {
        this.doctorID = doctorID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}