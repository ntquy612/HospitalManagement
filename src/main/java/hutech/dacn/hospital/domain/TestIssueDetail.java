package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TestIssuesDetail")
public class TestIssueDetail {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "TestIssuesID", referencedColumnName = "TestIssuesID")
    private TestIssue testIssue;

    @EmbeddedId
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

    @OneToMany(mappedBy = "testIssueID")
    private List<TestIssueResult> testIssueIDResults;

    @OneToMany(mappedBy = "testID")
    private List<TestIssueResult> testIDIssueResults;

    @OneToMany(mappedBy = "testIssuesID")
    private List<TestResultImage> testIssuesIDTestResultImages;

    @OneToMany(mappedBy = "testID")
    private List<TestResultImage> testIDTestResultImages;

    public List<TestIssueResult> getTestIssueIDResults() {
        return testIssueIDResults;
    }

    public void setTestIssueIDResults(List<TestIssueResult> testIssueIDResults) {
        this.testIssueIDResults = testIssueIDResults;
    }

    public List<TestIssueResult> getTestIDIssueResults() {
        return testIDIssueResults;
    }

    public void setTestIDIssueResults(List<TestIssueResult> testIDIssueResults) {
        this.testIDIssueResults = testIDIssueResults;
    }

    public List<TestResultImage> getTestIssuesIDTestResultImages() {
        return testIssuesIDTestResultImages;
    }

    public void setTestIssuesIDTestResultImages(List<TestResultImage> testIssuesIDTestResultImages) {
        this.testIssuesIDTestResultImages = testIssuesIDTestResultImages;
    }

    public List<TestResultImage> getTestIDTestResultImages() {
        return testIDTestResultImages;
    }

    public void setTestIDTestResultImages(List<TestResultImage> testIDTestResultImages) {
        this.testIDTestResultImages = testIDTestResultImages;
    }

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