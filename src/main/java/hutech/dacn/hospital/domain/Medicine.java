package hutech.dacn.hospital.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "medicines")
public class Medicine {

    @Id
    @Column(name = "medicinesID", length = 30, unique = true)
    private String medicinesID;

    @ManyToOne
    @JoinColumn(name = "medicinesTypeID", referencedColumnName = "medicinesTypeID")
    private MedicineType medicineType;

    @Column(name = "medicinesName", length = 100, unique = true)
    private String medicinesName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "createUser", length = 30)
    private String createUser;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @Column(name = "updateUser", length = 30)
    private String updateUser;

    @Column(name = "updateDate")
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "medicine")
    private List<MedicinesDetail> medicinesDetails;

    public List<MedicinesDetail> getMedicinesDetails() {
        return medicinesDetails;
    }

    public void setMedicinesDetails(List<MedicinesDetail> medicinesDetails) {
        this.medicinesDetails = medicinesDetails;
    }

    public String getMedicinesID() {
        return medicinesID;
    }

    public void setMedicinesID(String medicinesID) {
        this.medicinesID = medicinesID;
    }

    public MedicineType getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }

    public String getMedicinesName() {
        return medicinesName;
    }

    public void setMedicinesName(String medicinesName) {
        this.medicinesName = medicinesName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
