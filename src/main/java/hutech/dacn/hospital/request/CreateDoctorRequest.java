package hutech.dacn.hospital.request;

public class CreateDoctorRequest {
    private String doctorTypeId;
    private String accountId;
    private String addressId;
    private String name;
    private String gender;
    private String phone;
    private String mail;
    private String identityId;
    private String status;
    private String medicalSpecialtyId; // chuyên ngành

    public String getDoctorTypeId() {
        return doctorTypeId;
    }

    public void setDoctorTypeId(String doctorTypeId) {
        this.doctorTypeId = doctorTypeId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMedicalSpecialtyId() {
        return medicalSpecialtyId;
    }

    public void setMedicalSpecialtyId(String medicalSpecialtyId) {
        this.medicalSpecialtyId = medicalSpecialtyId;
    }
}
