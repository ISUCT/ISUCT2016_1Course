import java.awt.*;
import java.awt.datatransfer.StringSelection;

/**
 * Created by stud_6 on 17.10.16.
 */

public class Car extends Tech{

    private String color;
    private String shade;
    private int Hex;

    private String brand;
    private String model;
    private int horsepower;

    private int numofwheels;

    public int getNumofwheels() {
        return numofwheels;
    }
    public void setNumofwheels(int numofwheels) {
        this.numofwheels = numofwheels;
    }


    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }



    void Starter(){
        System.out.println("Engine start");
    }



    public Car(){
        setColor("Red");
        setShade("Crimson");
    }
    public Car(String Col, String Shd ){
        setColor(Col);
        setShade(Shd);
    }

    @Override
    public String toString(){
        return "Color:"+this.getColor()+ "Shade:"+this.getShade();
    }

    public int getHex() {
        return Hex;
    }

    public String getColor() {
        return color;
    }
    public String getShade() {
        return shade;
    }

    public void setHex(int hex){
        Hex = hex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }




    //Изменил на bool

    boolean isOil(){
        System.out.println("Oil is OK");
        return true;
    }

    boolean isPressure(){
        System.out.println("Pressure is OK\r\n");
        return true;
    }

    //Изменил на bool


}




/*
public class Car {
    private String brand;
    private String model;
    private int horsepower;


    void Starter(){
        System.out.println("Engine start");
    }

    void isOil(){
        System.out.println("Oil is OK");
    }

    void isPressure(){
        System.out.println("Pressure is OK\r\n");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

}

*/
