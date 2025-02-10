package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "MedicalSpecialty")
public class MedicalSpecialty {

    @Id
    @Column(name = "MedicalSpecialtyID", length = 30)
    private String medicalSpecialtyID;

    @Column(name = "MedicalSpecialtyName", length = 100, unique = true)
    private String medicalSpecialtyName;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    public String getMedicalSpecialtyID() {
        return medicalSpecialtyID;
    }

    public void setMedicalSpecialtyID(String medicalSpecialtyID) {
        this.medicalSpecialtyID = medicalSpecialtyID;
    }

    public String getMedicalSpecialtyName() {
        return medicalSpecialtyName;
    }

    public void setMedicalSpecialtyName(String medicalSpecialtyName) {
        this.medicalSpecialtyName = medicalSpecialtyName;
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