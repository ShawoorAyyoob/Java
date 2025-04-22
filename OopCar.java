public class OopCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Rav4", 2017, "Black", 100);
        car1.displayCarDetails();
        car1.accelerate(20);
        car1.brake(10);
    }
}

class Car{
    String model;
    int year;
    String color;
    double speed;

    Car(String m, int y, String c, double s){
        this.model = m;
        this.year = y;
        this.color = c;
        this.speed = s;
    }

    void accelerate(double speedIncrease){
        this.speed = this.speed + speedIncrease;
        System.out.println("Increased Speed: " + this.speed + " km/h");

    }
    void brake(double speedDecrease){
        this.speed = this.speed - speedDecrease;
        System.out.println("Decreased Speed: " + this.speed + " km/h");

    }
    void displayCarDetails(){
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Current Speed: " + this.speed + " km/h");
    }
}