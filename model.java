public class model {
    String model;
    int year;
    String type;
    double price;

    public static void main(String[] args) {
        model car1 = new model();
        car1.model = "Toyota";
        car1.year = 2020;
        car1.type = "Sedan";
        car1.price = 25000.50;

        System.out.println("Car Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Type: " + car1.type);
        System.out.println("Price: $" + car1.price);

    } 

    
}
