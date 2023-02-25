package Model;

public abstract class Property {
    private int propertyId;
    private String propertyType;
    private int zip;
    private String streetAddress;
    private double listPrice;
    private int bedroomNumber=0;
    private int bathroomNumber=0;
    private double sqFootage;
    private boolean available;
//    Model.Property() {
//        streetAddress = "";
//        zip = 0;
//    }
//    public Property(int propertyId, String streetAddress, int zip) {
//        this.streetAddress = streetAddress;
//        this.zip = zip;
//    }

    //setters
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
    public void setBedroomNumber(int bedroomNumber) {
        this.bedroomNumber = bedroomNumber;
    }
    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
//getters

    public int getPropertyId() {
        return propertyId;
    }
    public int getBathroomNumber() {
        return bathroomNumber;
    }
    public int getBedroomNumber() {return bedroomNumber; }
    public int getZip(){return zip;}
    public String getStreetAddress() {
        return streetAddress;
    }
    public double getListPrice() {
        return listPrice;

    }
    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

}