/**
 * Created by stud_6 on 22.11.16.
 */
public class SuperCar extends Car  implements TechInterface {
    public SuperCar(){
        setColor("Gold");
        setShade("Rose Gold");
    }

    public SuperCar(String Col, String Shd){
        setColor(Col);
        setShade(Shd);
    }


    void Starter() {
        System.out.println("Engine loudly start");
    }
    @Override
    boolean isOil(){
        System.out.println("Oil is excellent");
        return true;
    }
    boolean isTurbocharging(){
        System.out.println("Turbocharging is OK\r\n");
        return true;

    }

    @Override
    public void addEquipment() {
        System.out.println("Equipment has been added");
    }
}






/*

public class SuperCar extends Car {
    void Starter() {
        System.out.println("Engine loudly start");
    }
    void isOil(){
        System.out.println("Oil is excellent");
    }
    void isTurbocharging(){
        System.out.println("Turbocharging is OK\r\n");

    }
}
*/