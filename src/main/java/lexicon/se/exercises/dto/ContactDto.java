package lexicon.se.exercises.dto;

import java.util.Objects;

public class ContactDto {

    private int phoneNum;
    private String email;
    private String address;

    public ContactDto() {
    }

    public ContactDto(int phoneNum, String email, String address) {
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDto that = (ContactDto) o;
        return phoneNum == that.phoneNum && Objects.equals(email, that.email) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNum, email, address);
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
