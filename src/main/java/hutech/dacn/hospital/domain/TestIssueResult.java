package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TestIssuesResult")
public class TestIssueResult {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "TestIssuesID", referencedColumnName = "TestIssuesID")
    private TestIssueDetail testIssueID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "TestID", referencedColumnName = "TestID")
    private TestIssueDetail testID;

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
    @JoinColumn(name = "WorkScheduleID", referencedColumnName = "WorkScheduleID")
    private WorkScheduleDetail workScheduleID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID")
    private WorkScheduleDetail shiftID;

    @Column(name = "Result", length = 1000)
    private  String result;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    public TestIssueDetail getTestIssueID() {
        return testIssueID;
    }

    public void setTestIssueID(TestIssueDetail testIssueID) {
        this.testIssueID = testIssueID;
    }

    public TestIssueDetail getTestID() {
        return testID;
    }

    public void setTestID(TestIssueDetail testID) {
        this.testID = testID;
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

    public WorkScheduleDetail getWorkScheduleID() {
        return workScheduleID;
    }

    public void setWorkScheduleID(WorkScheduleDetail workScheduleID) {
        this.workScheduleID = workScheduleID;
    }

    public WorkScheduleDetail getShiftID() {
        return shiftID;
    }

    public void setShiftID(WorkScheduleDetail shiftID) {
        this.shiftID = shiftID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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