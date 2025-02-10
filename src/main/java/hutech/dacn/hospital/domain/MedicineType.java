package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "MedicineType")
public class MedicineType {
    @Id
    @Column(name = "MedicinesTypeID", length = 30)
    private String medicinesTypeID;

    @Column(name = "MedicinesTypeName", length = 50, unique = true)
    private String medicinesTypeName;

    @Column(name = "CreateUser", length = 30)
    private String createUser;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateUser", length = 30)
    private String updateUser;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    public String getMedicinesTypeID() {
        return medicinesTypeID;
    }

    public void setMedicinesTypeID(String medicinesTypeID) {
        this.medicinesTypeID = medicinesTypeID;
    }

    public String getMedicinesTypeName() {
        return medicinesTypeName;
    }

    public void setMedicinesTypeName(String medicinesTypeName) {
        this.medicinesTypeName = medicinesTypeName;
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
