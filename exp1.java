import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime; 

class Car {
    String type;
    int noOfTyres;
    int cc;

    Car(String type, int noOfTyres, int cc) {
        this.type = type;
        this.noOfTyres = noOfTyres;
        this.cc = cc;
    }
}

public class CarsArrayList {
    public static void main(String[] args) {
        LocalTime.now();
        long Start= System.nanoTime(); // use to compile the time for system is start
        System.out.println(Start);
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Sedan", 4, 1500));
        carsList.add(new Car("SUV", 4, 2000));
        carsList.add(new Car("Hatchback", 4, 1200));
        carsList.add(new Car("Auto", 3, 500));
        carsList.add(new Car("Bike", 2, 250));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();

        for (Car car : carsList) {
            if (car.type.equalsIgnoreCase(vehicleType)) {
                System.out.println("Car Details: [Type: " + car.type + ", No. of tyres: " + car.noOfTyres + ", CC: " + car.cc + "]");
                long Stop= System.nanoTime();
                System.out.println(Stop);   // use to compile the time for system is stop
                System.out.println(Stop-Start);   // calculating and print start stop time
                return;  
            }
        }

        System.out.println("Vehicle type not found.");
        scanner.close();
        long Stop= System.nanoTime();
        System.out.println(Stop);   // use to compile the time for system is stop
        System.out.println(Stop-Start);     // calculating and print start stop time
    }
}
