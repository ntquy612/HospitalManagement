package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Account;
import hutech.dacn.hospital.domain.Address;
import hutech.dacn.hospital.domain.Patient;
import hutech.dacn.hospital.repository.AccountRepository;
import hutech.dacn.hospital.repository.AddressRepository;
import hutech.dacn.hospital.request.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AddressRepository addressRepository;
    public Account login(String username, String password) {
        Optional<Account> result = accountRepository.getByUsername(username);
        if(result.isPresent()){
            if(result.get().getPassword().compareTo(password) == 0) {
                return result.get();
            }
        }
        return null;
    }

    public boolean register(RegisterRequest request) {
        // Generate UserId
        // String userIdCustom = "";
        Address address = new Address();
//        address.setAddressId(customAddressId);
        address.setAddressNumber(request.getAddressNumber());
        address.setCity(request.getCity());
        address.setDistrict(request.getDistrict());
        address.setStreet(request.getStreet());
        address.setCreateDate(Date.from(Instant.now()));
        address.setWard(request.getWard());
        addressRepository.save(address);

        Account account = new Account();
//        account.setAccountId(userIdCustom);
        account.setUsername(request.getUsername());
        account.setPassword(request.getPassword());
        accountRepository.save(account);

        Patient patient = new Patient();
//        patient.setAddress(customAddressId);
//        patient.setAccountId(customAccountId);
        patient.setName(request.getName());
        patient.setGender(request.getGender());
        patient.setPhone(request.getPhone());
        patient.setEmail(request.getEmail());
        patient.setIdentityIdentification(request.getIdentityId());
    }

}
