package hutech.dacn.hospital.controller;

import hutech.dacn.hospital.domain.Account;
import hutech.dacn.hospital.domain.ResponseBuilder;
import hutech.dacn.hospital.exception.ServiceErrorCode;
import hutech.dacn.hospital.request.LoginRequest;
import hutech.dacn.hospital.request.RegisterRequest;
import hutech.dacn.hospital.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    // Get
    @GetMapping("/{id}")
    ////  http://localhost:8080/api/v1/account/BS1 (GET)
    public ResponseEntity<?> getById(@PathVariable() String accountID) {
        Account account = accountService.getAccountById(accountID);
        if(account == null) {
            return ResponseBuilder.notFound("Account not found");
        }
        return ResponseBuilder.ok(account);
    }


    @PostMapping("/registerAccountPatient")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        try{
            boolean result = accountService.register(request);
            if(result){
                return ResponseBuilder.ok();
            }
            return ResponseBuilder.conflict("Error occur during create account process");
        }
        catch (Exception ex){
            return ResponseBuilder.conflict(ex.getMessage());
        }

    }
    @PostMapping("/login")
    ////  http://localhost:8080/api/v1/account/login (POST)
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Account result = accountService.login(request.getUsername(), request.getPassword());
        if(result == null) {
            return ResponseBuilder.unauthorized(ServiceErrorCode.UNAUTHORIZED);
        }
        return ResponseBuilder.accepted(accountService.login(request.getUsername(), request.getPassword()));
    }

    @PostMapping("/test")
    ////  http://localhost:8080/api/v1/account/test (POST)
    public ResponseEntity<?> test(@RequestParam String accountType) {
        String id = accountService.AutoGenID(accountType);

        return ResponseBuilder.ok(id);
    }
    // Put

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String accountID) {
        accountService.deleteAccount(accountID);
    }
}
