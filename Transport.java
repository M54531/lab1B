import java.awt.*;

public class Transport extends lastbil{
private Car[] transCars = new Car[10];
static int loadedCars=0;

    public Transport(){
        car(4,Color.black,100,12,"chuj");
        stopEngine();
    }
    @Override
    public double speedFactor() {
        return 0;
    }

    @Override
    public void changeTilt(double vinkel) {

    }

    @Override
    public boolean driveAble() {
        return false;
    }

    public void load(Car c){
        double avst = Math.sqrt(getXPos() * getXPos() + getYPos() * getYPos()) - Math.sqrt(c.getXPos() * c.getXPos() + c.getYPos() * c.getYPos());
    }
}
