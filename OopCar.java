public class OopCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Rav4", 2017, "Black", 123);
        car1.displayCarDetails();
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
        speedIncrease = this.speed + speed;
    }
    void brake(double speedDecrease){
        speedDecrease = this.speed - speed;
    }
    void displayCarDetails(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Current Speed: " + speed);
    }
}
