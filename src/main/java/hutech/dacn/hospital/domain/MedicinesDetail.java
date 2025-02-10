package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "MedicinesDetail")
public class MedicinesDetail {
    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "MedicinesID", referencedColumnName = "MedicinesID")
    private Medicine medicine;

    @EmbeddedId
    @ManyToOne
    @JoinColumn(name = "unitID", referencedColumnName = "UnitID")
    private Unit unit;

    @Column(name = "price", length = 100, unique = true)
    private BigDecimal price;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "medicinesID")
    private List<PrescriptionDetail> medicinesIDetails;

    @OneToMany(mappedBy = "unitID")
    private List<PrescriptionDetail> unitIDetails;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public List<PrescriptionDetail> getMedicinesIDetails() {
        return medicinesIDetails;
    }

    public void setMedicinesIDetails(List<PrescriptionDetail> medicinesIDetails) {
        this.medicinesIDetails = medicinesIDetails;
    }

    public List<PrescriptionDetail> getUnitIDetails() {
        return unitIDetails;
    }

    public void setUnitIDetails(List<PrescriptionDetail> unitIDetails) {
        this.unitIDetails = unitIDetails;
    }
}
