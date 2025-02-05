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
}
