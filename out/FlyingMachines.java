/**
 * Created by stud_6 on 28.11.16.
 */
 abstract class FlyingMachines {
    private String model;
    private String brand;
    private int passengersCount;
    abstract void speed();
    abstract void acceleration();

    abstract void weight();

    public FlyingMachines(){
        System.out.println("Construct");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }



 }
