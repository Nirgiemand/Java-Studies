public class Main {

    public static void main(String[] args) {
        // write your code here



        Hamburger hamburger = new Hamburger("Basic", "Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.2);
        hamburger.addHamburgerAddition2("Cheese", 0.75);
        hamburger.addHamburgerAddition3("Cucumber",0.5);
        hamburger.addHamburgerAddition4("Double meat", 2);
        System.out.println("Total price of the burger is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Eggs", 2.3);
        healthyBurger.addHealthAddition2("Lentils", 1.4);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger());


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();

    }
}