//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar=new Car( "BMW" , 100);

        myCar.displayInfo();

        System.out.println("Швидкість збільшилась і стала: "+myCar.increaseSpeed(20));;

        myCar.displayInfo();
    }
}