
public abstract class Truck extends Car{

    public abstract boolean driveable();

    @Override
    public double speedFactor(){
        return getEnginePower()*0.01;
    }

    @Override
    public void startEngine() {
        if (driveable()) {
            super.startEngine();
        } else {
            System.out.println("dfvdfgdfg");
        }
    }
    @Override
    public void gas(double amount) {
        if (driveable()) {
            super.gas(amount);
        }
    }


}
