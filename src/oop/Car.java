package oop;

public class Car {
    private float fuel;
    private float fuelConsumption;
    private boolean Started;
     static int wheels = 4;

    public Car(float fuel, float fuelConsumption, boolean started)
    {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        Started = started;
    }

    public float getFuel() {
        return fuel;
    }

    public void start()
    {
        Started=true;
    }
     public void drive(int distance)
     {
         if(distance > range() ) System.out.println(distance - range() + " left ");
        fuel = fuel - (fuelConsumption*distance/100);

        if ( fuel < 0) fuel = 0;


     }
     public float range()
     {
         return fuel/fuelConsumption*100;

     }
}
