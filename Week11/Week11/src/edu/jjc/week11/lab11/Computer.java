package edu.jjc.week11.lab11;

public class Computer extends Electronics {
    private String operatingSystem;

    //Get and setters
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

//Constructor
    public Computer(String operatingSystem, String brandName) {
        super(brandName);
        setOperatingSystem(operatingSystem);
    }

    @Override
    public String toString() {
        return "BrandName = "+super.getBrandName()+" OperatingSystem = "+getOperatingSystem();
    }
}
