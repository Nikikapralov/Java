//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


// Reference data types - Objects
// Stored on the Heap and are automatically garbage collected.
// They are slower and provide a reference. When reassigning the value, we actually create
// a new instance and tell the reference that it points to that now.
// Static keyword - the static keyword works like class variables in Python. The variable is shared
// across all instances of the class. It also works like static variables for C++, variables that are
// initialised once.

import Ex1.DataEntry;
import Ex2.Containers;
import Ex3.Classes;
import Ex4.Car;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //DataEntry.data_input();
        //Containers.array();
        //Classes my_class = new Classes("Tashacho", 20);
        //System.out.println(my_class.get_data());
        //Containers.array_list();
        //Containers.hash_map();
        Car car = new Car("Porshe", 100, 400, 20, 2);
        car.drive();
        System.out.println(car);
        Car car2 = new Car("BMW", 200, 300, 25, 4);
        Car car3 = new Car(car2);

        System.out.println(car3);
        System.out.println(car2);
    }
}
