package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TestIssuesDetail")
public class TestIssueDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "TestIssuesID", referencedColumnName = "TestIssuesID")
    private TestIssue testIssue;

    @Id
    @ManyToOne
    @JoinColumn(name = "TestID", referencedColumnName = "TestID")
    private Test test;

    @Column(name = "Status", length = 30)
    private String Status;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "TestIssuesDetail")
    private List<MedicinesDetail> medicinesDetails;

    public TestIssue getTestIssue() {
        return testIssue;
    }

    public void setTestIssue(TestIssue testIssue) {
        this.testIssue = testIssue;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
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
