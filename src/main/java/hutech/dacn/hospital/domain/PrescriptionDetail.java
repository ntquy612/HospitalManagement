package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PrescriptionDetail")
public class PrescriptionDetail {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "PrescriptionID", referencedColumnName = "PrescriptionID")
    private Prescription prescription;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "MedicinesID", referencedColumnName = "MedicinesID")
    private MedicinesDetail medicinesID;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "UnitID", referencedColumnName = "UnitID")
    private MedicinesDetail unitID;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "Quantity")
    private  Integer quantity;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public MedicinesDetail getMedicinesID() {
        return medicinesID;
    }

    public void setMedicinesID(MedicinesDetail medicinesID) {
        this.medicinesID = medicinesID;
    }

    public MedicinesDetail getUnitID() {
        return unitID;
    }

    public void setUnitID(MedicinesDetail unitID) {
        this.unitID = unitID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
