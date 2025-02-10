package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "WorkScheduleDetail")
public class WorkScheduleDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "WorkScheduleID", referencedColumnName = "WorkScheduleID")
    private WorkSchedule workSchedule;

    @Id
    @ManyToOne
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    private Doctor doctor;

    @Id
    @ManyToOne
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID")
    private Shift shift;

    @Id
    @ManyToOne
    @JoinColumn(name = "RoomID", referencedColumnName = "RoomID")
    private Room room;

    @Column(name = "Status", length = 30)
    private String status;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "WorkScheduleDetail")
    private List<MedicalRecordDetail> medicalRecordDetails;

    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(WorkSchedule workSchedule) {
        this.workSchedule = workSchedule;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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

    public List<MedicalRecordDetail> getMedicalRecordDetails() {
        return medicalRecordDetails;
    }

    public void setMedicalRecordDetails(List<MedicalRecordDetail> medicalRecordDetails) {
        this.medicalRecordDetails = medicalRecordDetails;
    }
}