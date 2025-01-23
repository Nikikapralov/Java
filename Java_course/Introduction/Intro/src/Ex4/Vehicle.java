package Ex4;

public abstract class Vehicle {

    private String name;
    private int speed;
    private int horse_power;
    private double fuel_consumption;

    public Vehicle(String name, int speed, int horse_power, double fuel_consumption){
        this.name = name;
        this.speed = speed;
        this.horse_power = horse_power;
        this.fuel_consumption = fuel_consumption;
    }

    protected void copy(Vehicle x){
        this.name = x.get_name();
        this.speed = x.get_speed();
        this.horse_power = x.get_horse_power();
        this.fuel_consumption = x.get_fuel_consumption();
    }

    public Vehicle(Vehicle x){
        this.copy(x);
    }

    public String get_name(){
        return this.name;
    }

    public void set_name(String name){
        this.name = name;
    }

    public int get_speed(){
        return this.speed;
    }

    public void set_speed(int speed){
        this.speed = speed;
    }

    public int get_horse_power(){
        return this.horse_power;
    }

    public void set_horse_power(int horse_power){
        this.horse_power = horse_power;
    }

    public double get_fuel_consumption(){
        return this.fuel_consumption;
    }

    public void set_fuel_consumption(double fuel_consumption){
        this.fuel_consumption = fuel_consumption;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', speed=" + speed +
                ", horse_power=" + horse_power + ", fuel_consumption=" + fuel_consumption + "}";
    }

}
