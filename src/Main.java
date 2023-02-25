import Concret.PropertyFactory;
import Model.Property;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PropertyFactory propertyFactory= new PropertyFactory();
        Property theProperty= null;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String propertyType = scanner.nextLine();
            theProperty=propertyFactory.createProperty(propertyType);}
        else System.out.println("Please choose type of property you would like to see");
        }
    }
