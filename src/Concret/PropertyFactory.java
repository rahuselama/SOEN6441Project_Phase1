package Concret;
import Model.Property;
public class PropertyFactory {
    public Property createProperty(String propertyType){
        Property newProperty=null;
        if(propertyType.equals("Appartement")) {
            return new Appartement();
        }
        else if(propertyType.equals("Condo")){
            return new Condo();
        }
        else if(propertyType.equals("House")) {
            return new House();}
        else return null;
    }
}
