package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "WorkScheduleDetail")
public class WorkScheduleDetail {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "WorkScheduleID", referencedColumnName = "WorkScheduleID")
    private WorkSchedule workSchedule;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "DoctorID", referencedColumnName = "DoctorID")
    private Doctor doctor;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID")
    private Shift shift;

    @EmbeddedId
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

    @OneToMany(mappedBy = "workScheduleID")
    private List<MedicalRecordDetail> workScheduleIDetails;

    @OneToMany(mappedBy = "doctorID")
    private List<MedicalRecordDetail> doctorIDetails;

    @OneToMany(mappedBy = "roomID")
    private List<MedicalRecordDetail> roomIDetails;

    @OneToMany(mappedBy = "shiftID")
    private List<MedicalRecordDetail> shiftIDetails;

    @OneToMany(mappedBy = "workScheduleID")
    private List<TestIssueResult> workScheduleIDTestIssueResults;

    @OneToMany(mappedBy = "doctorID")
    private List<TestIssueResult> doctorIDTestIssueResults;

    @OneToMany(mappedBy = "roomID")
    private List<TestIssueResult> roomIDTestIssueResults;

    @OneToMany(mappedBy = "shiftID")
    private List<TestIssueResult> shiftIDTestIssueResults;


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

    public List<MedicalRecordDetail> getWorkScheduleIDetails() {
        return workScheduleIDetails;
    }

    public void setWorkScheduleIDetails(List<MedicalRecordDetail> workScheduleIDetails) {
        this.workScheduleIDetails = workScheduleIDetails;
    }

    public List<MedicalRecordDetail> getDoctorIDetails() {
        return doctorIDetails;
    }

    public void setDoctorIDetails(List<MedicalRecordDetail> doctorIDetails) {
        this.doctorIDetails = doctorIDetails;
    }

    public List<MedicalRecordDetail> getRoomIDetails() {
        return roomIDetails;
    }

    public void setRoomIDetails(List<MedicalRecordDetail> roomIDetails) {
        this.roomIDetails = roomIDetails;
    }

    public List<MedicalRecordDetail> getShiftIDetails() {
        return shiftIDetails;
    }

    public void setShiftIDetails(List<MedicalRecordDetail> shiftIDetails) {
        this.shiftIDetails = shiftIDetails;
    }

    public List<TestIssueResult> getWorkScheduleIDTestIssueResults() {
        return workScheduleIDTestIssueResults;
    }

    public void setWorkScheduleIDTestIssueResults(List<TestIssueResult> workScheduleIDTestIssueResults) {
        this.workScheduleIDTestIssueResults = workScheduleIDTestIssueResults;
    }

    public List<TestIssueResult> getDoctorIDTestIssueResults() {
        return doctorIDTestIssueResults;
    }

    public void setDoctorIDTestIssueResults(List<TestIssueResult> doctorIDTestIssueResults) {
        this.doctorIDTestIssueResults = doctorIDTestIssueResults;
    }

    public List<TestIssueResult> getRoomIDTestIssueResults() {
        return roomIDTestIssueResults;
    }

    public void setRoomIDTestIssueResults(List<TestIssueResult> roomIDTestIssueResults) {
        this.roomIDTestIssueResults = roomIDTestIssueResults;
    }

    public List<TestIssueResult> getShiftIDTestIssueResults() {
        return shiftIDTestIssueResults;
    }

    public void setShiftIDTestIssueResults(List<TestIssueResult> shiftIDTestIssueResults) {
        this.shiftIDTestIssueResults = shiftIDTestIssueResults;
    }
}