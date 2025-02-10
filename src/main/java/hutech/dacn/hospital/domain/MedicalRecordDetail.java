package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MedicalRecordDetail")
public class MedicalRecordDetail {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "WorkScheduleID", referencedColumnName = "WorkScheduleID")
    private WorkScheduleDetail workScheduleID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "MedicalRecordID", referencedColumnName = "MedicalRecordID")
    private MedicalRecord medicalRecord;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    private WorkScheduleDetail doctorID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "RoomID", referencedColumnName = "RoomID")
    private WorkScheduleDetail roomID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID")
    private WorkScheduleDetail shiftID;

    @EmbeddedId
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

    public WorkScheduleDetail getShiftID() {
        return shiftID;
    }

    public void setShiftID(WorkScheduleDetail shiftID) {
        this.shiftID = shiftID;
    }

    public WorkScheduleDetail getWorkScheduleID() {
        return workScheduleID;
    }

    public void setWorkScheduleID(WorkScheduleDetail workScheduleID) {
        this.workScheduleID = workScheduleID;
    }

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
