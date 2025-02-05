package hutech.dacn.hospital.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MedicineType")
public class MedicineType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineTypeId;

    private String medicineTypeName;

    // Audit fields
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;

    // Getters and setters
}
