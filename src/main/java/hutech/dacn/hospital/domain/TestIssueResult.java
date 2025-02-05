package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TestIssuesResult")
public class TestIssueResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "testIssuesId")
    private TestIssue testIssues;

    @ManyToOne
    @JoinColumn(name = "testId")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room;

    private String result;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TestIssue getTestIssues() {
        return testIssues;
    }

    public void setTestIssues(TestIssue testIssues) {
        this.testIssues = testIssues;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
