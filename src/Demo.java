public class Demo {
    public static void main(String[] args) {
        Car c = new Car();
      //  System.out.println(Demo.toString());
        c.setBrand("Volkswagen");
        c.setModel("Golf VII");
        c.setHorsepower(170);
        c.Starter();
        c.isOil();
        c.isPressure();

        Car[] cars;
        cars = new Car[3];
        cars[0] = new Car();
        cars[0].setBrand("Volkswagen");
        cars[0].setModel("Golf I");
        cars[0].setHorsepower(70);
        cars[0].Starter();
        cars[0].isOil();
        cars[0].isPressure();
        cars[1] = new Car();
        cars[1].setBrand("Volkswagen");
        cars[1].setModel("Golf II");
        cars[1].setHorsepower(80);
        cars[1].Starter();
        cars[1].isOil();
        cars[1].isPressure();
        cars[2] = new Car();
        cars[2].setBrand("Volkswagen");
        cars[2].setModel("Golf III");
        cars[2].setHorsepower(90);
        cars[2].Starter();
        cars[2].isOil();
        cars[2].isPressure();

        SuperCar sc = new SuperCar();
        sc.setBrand("Porsche");
        sc.setModel("918");
        sc.setHorsepower(608);
        sc.Starter();
        sc.isOil();
        sc.isPressure();
        sc.isTurbocharging();



    for (int x=0; x<3; x=x+1) {
            System.out.println(cars[x].getModel());
        }
    }


    int summInt(int a, int b) {
        int c = a + b;
        return c;
    }


    long summLong(long a, long b) {
        long c = a + b;
        return c;
    }
}





/*

VERSION 1

public class Demo {
    public static void main(String[] args) {
        System.out.println("Ipatov Maxim");
    }
}

*/


/*

VERSION 2

public class Demo {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Volkswagen";
        c.model = "Golf VII";
        c.horsepower = 170;
        c.Starter();
        c.isOil();
        c.isPressure();


        Car[] cars;
        cars = new Car[3];
        cars[0] = new Car();
        cars[0].brand = "Volkswagen";
        cars[0].model = "Golf I";
        cars[0].horsepower = 70;
        cars[0].Starter();
        cars[0].isOil();
        cars[0].isPressure();
        cars[1] = new Car();
        cars[1].brand = "Volkswagen";
        cars[1].model = "Golf II";
        cars[1].horsepower = 80;
        cars[1].Starter();
        cars[1].isOil();
        cars[1].isPressure();
        cars[2] = new Car();
        cars[2].brand = "Volkswagen";
        cars[2].model = "Golf III";
        cars[2].horsepower = 90;
        cars[2].Starter();
        cars[2].isOil();
        cars[2].isPressure();
    }
}

*/