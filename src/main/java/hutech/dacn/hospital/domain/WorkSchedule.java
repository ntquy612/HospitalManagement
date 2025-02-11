package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "WorkSchedule")
public class WorkSchedule {
    @Id
    @Column(name = "WorkScheduleID", length = 30)
    private String workScheduleID;

    @Column(name = "Date", unique = true)
    private Date date;

    @Column(name = "Status")
    private Boolean status;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "workSchedule")
    private List<WorkScheduleDetail> workScheduleDetails;

    public List<WorkScheduleDetail> getWorkScheduleDetails() {
        return workScheduleDetails;
    }

    public void setWorkScheduleDetails(List<WorkScheduleDetail> workScheduleDetails) {
        this.workScheduleDetails = workScheduleDetails;
    }

    public String getWorkScheduleID() {
        return workScheduleID;
    }

    public void setWorkScheduleID(String workScheduleID) {
        this.workScheduleID = workScheduleID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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
