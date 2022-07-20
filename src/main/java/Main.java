public class Main {

    public static void main(String[] args) {
         Pizza.Builder builder=  new Pizza.Builder("Small");
         Pizza pizza=builder.chees(true).painapple(true).pepperoni(true).build();
        System.out.println( pizza);

    }
}
