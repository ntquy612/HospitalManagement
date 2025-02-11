package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
    Patient getByPatientID(String patientId);

//    Patient getByAccountId(String accountId);
    @Query(value = "select AutoIDPatient()", nativeQuery = true)
    String autoId();
}
