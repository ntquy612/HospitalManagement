package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Medicines")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicinesId;

    @ManyToOne
    @JoinColumn(name = "medicinesTypeId", nullable = false)
    private MedicineType medicinesType;

    private String medicinesName;
    private Integer quantity;

    // Audit fields
    private String createUser;
    private String createName;
    private Date createDate;
    private String updateUser;
    private String updateName;
    private Date updateDate;

    // Getters and Setters
    public Long getMedicinesId() {
        return medicinesId;
    }

    public void setMedicinesId(Long medicinesId) {
        this.medicinesId = medicinesId;
    }

    public MedicineType getMedicinesType() {
        return medicinesType;
    }

    public void setMedicinesType(MedicineType medicinesType) {
        this.medicinesType = medicinesType;
    }

    public String getMedicinesName() {
        return medicinesName;
    }

    public void setMedicinesName(String medicinesName) {
        this.medicinesName = medicinesName;
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

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
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

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}

