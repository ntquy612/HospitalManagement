package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "DiseaseSymptom")
public class DiseaseSymptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diseaseSymptomId;

    @ManyToOne
    @JoinColumn(name = "diseaseId")
    private Disease disease;

    @ManyToOne
    @JoinColumn(name = "symptomId")
    private Symptom symptom;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters

    public Long getDiseaseSymptomId() {
        return diseaseSymptomId;
    }

    public void setDiseaseSymptomId(Long diseaseSymptomId) {
        this.diseaseSymptomId = diseaseSymptomId;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
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
