public class Main extends Ring{

    public static void main(String[] args) {
        // write your code here
        Ring ring1 = new Ring();
        System.out.println(ring1);
        System.out.println("X= " + ring1.x + ", Y= " + ring1.y + ", raadius = " + ring1.raadius + ", värv on " + ring1.varv);
        System.out.println("Esimese ringi ümbermõõt on " + ring1.umbermoot());
        System.out.println("Esimese ringi pindala on " + ring1.pindala());
        System.out.println();
        Ring ring2 = new Ring(8);
        System.out.println(ring2);
        System.out.println("Alguspunkti X= " + ring2.x + ", alguspunkti Y= " + ring2.y + ", raadius = " + ring2.raadius + ", värv on " + ring2.varv);
        System.out.println("Teise ringi ümbermõõt on " + ring2.umbermoot());
        System.out.println("Teise ringi pindala on " + ring2.pindala());
        System.out.println();
        Ring ring3 = new Ring(5,3,5,"Sinine");
        System.out.println(ring3);
        System.out.println("Alguspunkti X= " + ring3.x + ", alguspunkti Y= " + ring3.y + ", raadius = " + ring3.raadius + ", värv on " + ring3.varv);
        System.out.println("Teise ringi ümbermõõt on " + ring3.umbermoot());
        System.out.println("Teise ringi pindala on " + ring3.pindala());
        System.out.println();
    }
}