public class Car {
    String brand;
    int speed;

    public Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public void displayInfo(){
        System.out.println("Марка: " + brand + ", Швидкість: " + speed + " км/год");
    }
    public int increaseSpeed(int value){
        speed+=value;
        return speed;
    }


}
