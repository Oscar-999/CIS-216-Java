package edu.jjc.week11.lab11;

public class Phone extends Computer{
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
//Constructor
    public Phone(String phoneNumber, String operatingSystem, String brandName) {
        super(operatingSystem, brandName);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        return "BrandName = "+super.getBrandName()+" OperatingSystem = "+super.getOperatingSystem() + " PhoneNumber = "+getPhoneNumber();
    }
}
