package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AppointmentTime")
public class AppointmentTime {

    @Id
    @Column(name = "AppointmentTimeID", length = 30, unique = true)
    private String appointmentTimeID;

    @ManyToOne
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID")
    private Shift shift;

    @Column(name = "Time")
    private LocalDateTime time;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "appointmentTime")
    private List<MedicalRecordDetail> appointmentTimeDetails;

    public String getAppointmentTimeID() {
        return appointmentTimeID;
    }

    public void setAppointmentTimeID(String appointmentTimeID) {
        this.appointmentTimeID = appointmentTimeID;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
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

    public List<MedicalRecordDetail> getAppointmentTimeDetails() {
        return appointmentTimeDetails;
    }

    public void setAppointmentTimeDetails(List<MedicalRecordDetail> appointmentTimeDetails) {
        this.appointmentTimeDetails = appointmentTimeDetails;
    }
}