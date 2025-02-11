package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TestResultImage")
public class TestResultImage {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "TestIssuesID", referencedColumnName = "TestIssuesID")
    private TestIssueDetail testIssuesID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "TestID", referencedColumnName = "TestID")
    private TestIssueDetail testID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "ImageID", referencedColumnName = "ImageID")
    private Image imageID;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    public TestIssueDetail getTestIssuesID() {
        return testIssuesID;
    }

    public void setTestIssuesID(TestIssueDetail testIssuesID) {
        this.testIssuesID = testIssuesID;
    }

    public TestIssueDetail getTestID() {
        return testID;
    }

    public void setTestID(TestIssueDetail testID) {
        this.testID = testID;
    }

    public Image getImageID() {
        return imageID;
    }

    public void setImageID(Image imageID) {
        this.imageID = imageID;
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