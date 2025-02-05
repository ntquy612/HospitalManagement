package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TestResultImage")
public class TestResultImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testResultImageId;

    @ManyToOne
    @JoinColumn(name = "testIssueResultId")
    private TestIssueResult testIssueResult;

    @ManyToOne
    @JoinColumn(name = "imageId")
    private Image image;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters

    public Long getTestResultImageId() {
        return testResultImageId;
    }

    public void setTestResultImageId(Long testResultImageId) {
        this.testResultImageId = testResultImageId;
    }

    public TestIssueResult getTestIssueResult() {
        return testIssueResult;
    }

    public void setTestIssueResult(TestIssueResult testIssueResult) {
        this.testIssueResult = testIssueResult;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
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
