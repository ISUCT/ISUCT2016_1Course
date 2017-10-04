public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        Airplane c = new Airplane();
        c.setBrand("boung");
        c.setModel("f30000");
        c.setPassengersCount(1000);
        c.takepassenger();
        c.uploadCould();
        c.takeage();



        Airplane[] airplanes = new Airplane[3];

        airplanes[0] = new Airplane();
        airplanes[0].setBrand("boung");
        airplanes[0].setModel("f30000");
        airplanes[0].setPassengersCount(1000);
        airplanes[0].takepassenger();
        airplanes[0].uploadCould();
        airplanes[0].takeage();
        airplanes[1] = new Airplane();
        airplanes[1].setBrand("boung");
        airplanes[1].setModel("f30001");
        airplanes[1].setPassengersCount(1500);
        airplanes[1].takepassenger();
        airplanes[1].uploadCould();
        airplanes[1].takeage();
        airplanes[2] = new Airplane();
        airplanes[2].setBrand("boung");
        airplanes[2].setModel("f32300");

        airplanes[2].setPassengersCount(2000);
        airplanes[2].takepassenger();
        airplanes[2].uploadCould();
        airplanes[2].takeage();
        for (int x = 0; x < 3; x = x + 1) System.out.println(airplanes[x].getModel());

    }





    int summ(int a, int b) {
        int c = a + b;
        return c;
    }


    }
}