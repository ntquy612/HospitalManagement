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

    public Long getPrescriptionDetailId() {
        return prescriptionDetailId;
    }

    public void setPrescriptionDetailId(Long prescriptionDetailId) {
        this.prescriptionDetailId = prescriptionDetailId;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
