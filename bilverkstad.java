import java.util.ArrayList;
import java.util.List;

public class bilverkstad<carType extends Car>{

    public int maxAntal;
    public ArrayList<Car> carsInside=new ArrayList<Car>();
    public String Name;
    public carType biltyp;
    private double xPos;
    private double yPos;

    public bilverkstad(){

        maxAntal=1;
        Name = "default";
    }

    public bilverkstad(String Name,int maxAntal,double xPos,double yPos){
        this.Name=Name;
        this.maxAntal=maxAntal;
        this.xPos=xPos;
        this.yPos=yPos;
    }

    /**
     * load a new car to bilverkstad
     * @param car car of cartype
     */
    public void loadCar(carType car) {
      double b= Math.sqrt(Math.pow(xPos-car.getXPos(),2)+Math.pow(yPos-car.getYPos(),2));
      System.out.println(b);
      if(b<1&&carsInside.size()<maxAntal&&!carsInside.contains(car)){
          System.out.println(carsInside);
          carsInside.add(car);
          car.setXPos(xPos);
          car.setYPos(yPos);
      }
    }

    /**
     * unload a car from bilverkstad
     * @param car
     */
    public void unloadCar(carType car) {
        if(carsInside.contains(car)) {
            int index=carsInside.indexOf(car);
            carsInside.get(index).setXPos(xPos-1);
            carsInside.get(index).setYPos(yPos-1);
            carsInside.remove(index);
        }
    }




}
