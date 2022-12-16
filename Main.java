public class Main {
    public static void main(String[] args) {
        Person masha = new Person("Маша");
        Person petya = new Person("Петя");

        Wardrobe doorW = new Wardrobe();

        doorW.getDoor(masha);
        doorW.getDoor(petya);

        // System.out.print(masha.getName() + " "); doorW.door();
        // System.out.print(petya.getName() + " "); doorW.door();
    }
}