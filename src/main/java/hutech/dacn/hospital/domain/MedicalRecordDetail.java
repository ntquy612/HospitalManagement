package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
public class MedicalRecordDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "MedicalRecordID", referencedColumnName = "MedicalRecordID")
    private MedicalRecord medicalRecord;

    @Id
    @ManyToOne
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    private WorkScheduleDetail doctorID;

    @Id
    @ManyToOne
    @JoinColumn(name = "RoomID", referencedColumnName = "RoomID")
    private WorkScheduleDetail roomID;

    @Id
    @ManyToOne
    @JoinColumn(name = "AppointmentTimeID", referencedColumnName = "AppointmentTimeID")
    private AppointmentTime appointmentTime;

    @Column(name = "Detail", length = 1000)
    private  String detail;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public WorkScheduleDetail getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(WorkScheduleDetail doctorID) {
        this.doctorID = doctorID;
    }

    public WorkScheduleDetail getRoomID() {
        return roomID;
    }

    public void setRoomID(WorkScheduleDetail roomID) {
        this.roomID = roomID;
    }

    public AppointmentTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(AppointmentTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
