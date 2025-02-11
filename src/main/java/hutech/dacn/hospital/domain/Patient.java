package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @Column(name = "PatientID", length = 30)
    private String patientID;

    @ManyToOne
    @JoinColumn(name = "AddressID", referencedColumnName = "AddressID")
    private Address address;

    @Column(name = "IsMain")
    private Boolean isMain;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Gender", length = 100)
    private String gender;

    @Column(name = "Phone", length = 100)
    private String phone;

    @Column(name = "Email", length = 100)
    private String mail;

    @Column(name = "IdentityID", length = 100, unique = true)
    private String identityID;

    @Column(name = "HealthIdentification", length = 100, unique = true)
    private String healthIdentification;

    @Column(name = "Status", length = 100)
    private String status;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getMain() {
        return isMain;
    }

    public void setMain(Boolean main) {
        isMain = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String gmail) {
        this.mail = gmail;
    }

    public String getIdentityID() {
        return identityID;
    }

    public void setIdentityID(String identityID) {
        this.identityID = identityID;
    }

    public String getHealthIdentification() {
        return healthIdentification;
    }

    public void setHealthIdentification(String healthIdentification) {
        this.healthIdentification = healthIdentification;
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
