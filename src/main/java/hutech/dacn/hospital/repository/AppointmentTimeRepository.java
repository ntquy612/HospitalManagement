package hutech.dacn.hospital.repository;

import hutech.dacn.hospital.domain.AppointmentTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentTimeRepository extends JpaRepository<AppointmentTime, String> {
}
