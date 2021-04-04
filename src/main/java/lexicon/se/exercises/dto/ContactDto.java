package lexicon.se.exercises.dto;

public class ContactDto {

    private int phoneNum;
    private String email;
    private String address;

    public ContactDto() {
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
    public String toString() {
        return "ContactDto{" +
                "phoneNum=" + phoneNum +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
