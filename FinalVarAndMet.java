public class FinalVarAndMet {
    public static void main(String[] args) {
        final int MAX_SPEED = 100;
        System.out.println("Max Speed Limit = " + MAX_SPEED);
        // MAX_SPEED = 150;
    }
}

class Vehicle {
    public final void showType() {
        System.out.println("Garage of new rides");
    }
}

class Car extends Vehicle {
    // public void showType(){
    //     System.out.println("New Car");
    // }
}