package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Account;
import hutech.dacn.hospital.domain.Address;
import hutech.dacn.hospital.domain.Patient;
import hutech.dacn.hospital.repository.AccountRepository;
import hutech.dacn.hospital.repository.AddressRepository;
import hutech.dacn.hospital.repository.PatientRepository;
import hutech.dacn.hospital.request.RegisterRequest;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private PatientRepository patientRepository;
    public Account login(String username, String password) {
        // Nhớ check password ByCrypt
        Optional<Account> result = accountRepository.getByUsername(username);
        if(result.isPresent()){
            boolean isMatch = BCrypt.checkpw(password, result.get().getPassword());
            if(isMatch) {
                return result.get();
            }
        }

        return null;
    }

    public boolean register(RegisterRequest request) {
        try {
            // Generate UserId
            // String userIdCustom = "";
            String addressId = addressRepository.autoId();
            String accountId = accountRepository.autoId(request.getAccountType());
            String patientId = patientRepository.autoId();
            Address address = new Address();
            address.setAddressID(addressId);
            address.setAddressNumber(request.getAddressNumber());
            address.setCity(request.getCity());
            address.setDistrict(request.getDistrict());
            address.setStreet(request.getStreet());
            address.setCreateDate(LocalDateTime.now());
            address.setWard(request.getWard());
            address.setCreateUser(patientId);
            address.setCreateDate(LocalDateTime.now());
            addressRepository.save(address);

            Account account = new Account();
            String salt = BCrypt.gensalt();
            account.setAccountId(accountId);
            account.setUsername(request.getUsername());
            account.setStatus(request.getStatus());
            account.setCreateUser(patientId);
            account.setCreateDate(LocalDateTime.now());

            account.setPassword(BCrypt.hashpw(request.getPassword(), salt));
            accountRepository.save(account);

            Patient patient = new Patient();

            patient.setPatientID(patientId);
            patient.setAddress(address);
            patient.setAccount(account);
            patient.setMain(true);
            patient.setName(request.getName());
            patient.setGender(request.getGender());
            patient.setPhone(request.getPhone());
            patient.setMail(request.getEmail());
            patient.setIdentityID(request.getIdentityId());
            patient.setHealthIdentification(request.getHealthIdentification());
            patient.setCreateUser(patientId);
            patient.setCreateDate(LocalDateTime.now());
            patient.setStatus(request.getStatus());
            patientRepository.save(patient);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean registerDoctor() {
        return false;
    }

    public Account getAccountById(String accountId) {
        Optional<Account> result = accountRepository.getByAccountId(accountId);
        return result.orElse(null);
    }

    public String AutoGenID(String accountType) {
        return accountRepository.autoId(accountType);
    }

    public void deleteAccount(String id) {

    }

}
