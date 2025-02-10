package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Symptoms")
public class Symptom {

    @Id
    @Column(name = "SymptomsID", length = 30)
    private String symptomsID;

    @Column(name = "SymptomsName", length = 100, unique = true)
    private String symptomsName;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "symptoms")
    private List<SuggestMedicalSpecialty> suggestMedicalSpecialties;

    public String getSymptomsID() {
        return symptomsID;
    }

    public void setSymptomsID(String symptomsID) {
        this.symptomsID = symptomsID;
    }

    public String getSymptomsName() {
        return symptomsName;
    }

    public void setSymptomsName(String symptomsName) {
        this.symptomsName = symptomsName;
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

    public List<SuggestMedicalSpecialty> getSuggestMedicalSpecialties() {
        return suggestMedicalSpecialties;
    }

    public void setSuggestMedicalSpecialties(List<SuggestMedicalSpecialty> suggestMedicalSpecialties) {
        this.suggestMedicalSpecialties = suggestMedicalSpecialties;
    }
}