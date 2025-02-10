package hutech.dacn.hospital.controller;

import hutech.dacn.hospital.domain.Account;
import hutech.dacn.hospital.domain.ResponseBuilder;
import hutech.dacn.hospital.exception.ServiceErrorCode;
import hutech.dacn.hospital.request.LoginRequest;
import hutech.dacn.hospital.request.RegisterRequest;
import hutech.dacn.hospital.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    // Get

    // Post
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
//
//    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Account result = accountService.login(request.getUsername(), request.getPassword());
        if(result == null) {
            return ResponseBuilder.unauthorized(ServiceErrorCode.UNAUTHORIZED);
        }
        return ResponseBuilder.accepted(accountService.login(request.getUsername(), request.getPassword()));
    }

    // Put

    // Delete
}
