import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Biltransport extends Truck{
    private boolean rampDown;
    private int maxCars;
    private Car[] loadedCars= new Car[8];
    private static int nrLoadedCars;
    ArrayList<Car> cars1 = new ArrayList<>();
    public ArrayList<Car> getCars1(){
        return cars1;
    }
    public Biltransport(){
        car(2, Color.green,80,12,"Biltransport");
        rampDown=true;
        maxCars=8;
        nrLoadedCars=0;

    }
    public void setLoadedCar(int i, Car c) {cars1.set(i,c); }

    /**
     * open/close ramp
     */
    public void setRamp(){
        if(getCurrentSpeed()==0){
            rampDown=!rampDown;
        }
    }

    /**
     * load car c
     * @param c car c
     */
    public void loadCar(Car c){
        double avst = Math.sqrt(getXPos() * getXPos() + getYPos() * getYPos()) - Math.sqrt(c.getXPos() * c.getXPos() + c.getYPos() * c.getYPos());
        if(c.getSize()<maxCars && avst<1 && rampDown && this!=c &&!cars1.contains(c)){
            nrLoadedCars++;
            cars1.add(c);
            //loadedCars[nrLoadedCars]=c;
            c.setXPos(getXPos());
            c.setYPos(getYPos());
            c.driveable=false;
        }else{System.out.println("<zzz< "+"RampDown:"+rampDown);}
    }

    /**
     * unload last car
     */
    public void unload(){
        if (rampDown){
            if(nrLoadedCars!=0){
                cars1.get(nrLoadedCars-1).setXPos(Math.cos(getTheta())+getXPos());
                cars1.get(nrLoadedCars-1).setYPos(Math.sin(getTheta())+getYPos());
                cars1.get(nrLoadedCars-1).driveable=true;
                cars1.remove(nrLoadedCars-1);
                nrLoadedCars--;
            }
        }else{System.out.println("Ramp down: "+rampDown);}
    }

    @Override
    public void move(){
        if(driveable()) {
            setXPos(Math.cos(getTheta()) * getCurrentSpeed() + getXPos());
            setYPos(Math.sin(getTheta()) * getCurrentSpeed() + getYPos());
            for (Car c : cars1) {
                c.setXPos(getXPos());
                c.setYPos(getYPos());
            }
        }
    }

    @Override
    public boolean driveable(){
        return !rampDown;
    }

    public boolean getRampDown(){
        return rampDown;
    }
    public int getNrLoadedCars(){
        return nrLoadedCars;
    }
    public Car getLoadedCar(int a){
        return cars1.get(a);
    }
    public void setNrLoadedCars(int a){
        nrLoadedCars=a;
    }
}

