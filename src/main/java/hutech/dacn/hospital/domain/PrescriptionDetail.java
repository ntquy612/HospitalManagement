package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PrescriptionDetail")
public class PrescriptionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescriptionDetailId;

    @ManyToOne
    @JoinColumn(name = "prescriptionId")
    private Prescription prescription;

    @ManyToOne
    @JoinColumn(name = "medicineId")
    private Medicine medicine;

    private int quantity;
    private String unit;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}
