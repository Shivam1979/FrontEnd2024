package OOPsQuetion;
//1. Create a class Car with attributes make, model, and year. Include a method display_info()
// that prints the car's details. Then, create an object of the Car class and call the display_info() method.
public class Car {
    String make ;
    String model;
   public int year;
   Car(String m ,String d , int y){
       make = m;
       model =d;
       year = y;
   }
    public static void display_info(Car c){
        System.out.println("Car Details");
        System.out.println("Make : "+c.make);
        System.out.println("Model: "+c.model);
        System.out.println("Year : "+c.year);
        System.out.println("------------------------");
        System.out.println();
    }
    public static void main(String[] args) {
        Car a = new Car("Hyundai","verna",2018);
        Car b = new Car("Maruti" ,"Swift" ,2020);
        Car c = new Car("Tata","Nexon" ,2022);
        Car d= new Car("Mahindra","Scorpio",2020);
        display_info(a);
        display_info(b);
        display_info(c);
        display_info(d);
    }
}
