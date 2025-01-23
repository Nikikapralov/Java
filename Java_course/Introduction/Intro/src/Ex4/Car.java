package Ex4;



public class Car extends Vehicle implements Refuable {
    private int seat_number;

    public Car(String name, int speed, int horse_power, double fuel_consumption, int seat_number){
        super(name, speed, horse_power, fuel_consumption);
        set_seat_number(seat_number);
    }

    public Car(Car x){
        super(x);
        this.copy(x);
    }

    public int get_seat_number(){
        return this.seat_number;
    }

    private void set_seat_number(int seat_number){
        this.seat_number = seat_number;
    }

    private void copy(Car x){
        this.seat_number = x.get_seat_number();
    }

    @Override
    public void drive(){
        System.out.println("Car is driving.");
    }

    @Override
    public String toString(){
        String str = super.toString();
        return str + " Car{seat_number=" + seat_number + "}";
    }

    @Override
    public void refuel(){
        System.out.println("Car is refueling.");
    }

}
