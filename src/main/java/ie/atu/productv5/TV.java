package ie.atu.productv5;

import ie.atu.productv3.Product;

public class TV extends Product {
    private String screenSize;
    private String manufacture;

    public TV(){
        super();
        screenSize = "";
        manufacture = "";
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString(){return super.toString() + " by " + manufacture + "Screen size is " + screenSize;}
}
