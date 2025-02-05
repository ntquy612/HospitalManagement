package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String gender;
    private String phone;
    private String email;
    private String identityIdentification;

    @ManyToOne
    @JoinColumn(name = "majorId")
    private Major major;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<WorkScheduleDetail> workScheduleDetails;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityIdentification() {
        return identityIdentification;
    }

    public void setIdentityIdentification(String identityIdentification) {
        this.identityIdentification = identityIdentification;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public List<WorkScheduleDetail> getWorkScheduleDetails() {
        return workScheduleDetails;
    }

    public void setWorkScheduleDetails(List<WorkScheduleDetail> workScheduleDetails) {
        this.workScheduleDetails = workScheduleDetails;
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

