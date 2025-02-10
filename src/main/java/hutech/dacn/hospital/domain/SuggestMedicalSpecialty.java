package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "SuggestMedicalSpecialty")
public class SuggestMedicalSpecialty {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "MedicalSpecialtyID", referencedColumnName = "MedicalSpecialtyID")
    private MedicalSpecialty medicalSpecialty;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "SymptomsID", referencedColumnName = "SymptomsID")
    private Symptoms symptoms;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    public MedicalSpecialty getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }

    public Symptoms getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Symptoms symptoms) {
        this.symptoms = symptoms;
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
