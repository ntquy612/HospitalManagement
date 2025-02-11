package hutech.dacn.hospital.service;

import hutech.dacn.hospital.domain.Address;
import hutech.dacn.hospital.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

//    public Address getAddressByAccountId(String accountId) {
//        Optional<Address> result = addressRepository.get
//    }
}
