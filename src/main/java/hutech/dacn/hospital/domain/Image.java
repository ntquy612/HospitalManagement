package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.sql.Blob; // Import for Blob
import java.util.List;

@Entity
@Table(name = "Image")
public class Image {

    @Id
    @Column(name = "ImageID", length = 30)
    private String imageID;

    @Lob
    @Column(name = "ImageDate")
    private Blob imageDate;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "imageID")
    private List<TestResultImage> testResultImages;

    public List<TestResultImage> getTestResultImages() {
        return testResultImages;
    }

    public void setTestResultImages(List<TestResultImage> testResultImages) {
        this.testResultImages = testResultImages;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public Blob getImageDate() {
        return imageDate;
    }

    public void setImageDate(Blob imageDate) {
        this.imageDate = imageDate;
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