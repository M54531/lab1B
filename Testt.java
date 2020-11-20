public class Testt {
    public static void main(String[] args){
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        Car[] cars= new Car[3];
        Biltransport big = new Biltransport();
        System.out.println("xpos: "+saab.getXPos()+"ypos: "+saab.getYPos());
        System.out.println(big.driveable());
        big.loadCar(saab);
        System.out.println(big.driveable());
        big.setRamp();
        big.startEngine();
        big.gas(1);
        System.out.println(big.cars1.get(0));
        System.out.println(big.getCurrentSpeed());
        big.move();
        System.out.println("xpos: "+big.getXPos()+"ypos: "+big.getYPos());
        System.out.println("xpos: "+saab.getXPos()+"ypos: "+saab.getYPos());
        big.brake(1);
        big.brake(1);
        big.setRamp();
        big.unload();
        System.out.println("xpos: "+saab.getXPos()+"ypos: "+saab.getYPos());
        bilverkstad<Volvo240> chuj = new bilverkstad();
        chuj.loadCar(volvo);
        chuj.loadCar(volvo);
        System.out.println(chuj.carsInside.get(0));
        BilFarja farja = new BilFarja();
        Volvo240 v2 =new Volvo240();
        Volvo240 v3 =new Volvo240();
        Volvo240 v4 =new Volvo240();
        farja.loadCar(v2);farja.loadCar(v3);
        //System.out.println(farja.contains1(v3) + farja.contains1(v4));
        System.out.println(farja.contains1(v3));
        System.out.println(farja.contains1(v4));
        farja.unload();
        System.out.println(farja.contains1(v2));
        //System.out.println(farja.contains1(v3));
    }
}
