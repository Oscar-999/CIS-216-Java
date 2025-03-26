package edu.jjc.week11.lab11;

public class Electronics {
    //variables
    private String brandName;

//Constructor
    public Electronics(String brandName) {
        setBrandName(brandName);
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "BrandName = " + getBrandName();
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
