import java.awt.*;

/**
 * special type of car,subclass of Car
 */
public class Saab95 extends Car{
    /**
     * boolean variable true if saab95 has turbo
     * affects acceleration
     */
    private final boolean turboOn;
    
    public Saab95(){
        car(2,Color.red,125,5,"Saab95");
	    turboOn = false;
        stopEngine();
    }

    /**
     *
     * @return  maximum increase in speed per unit of time
     */
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
