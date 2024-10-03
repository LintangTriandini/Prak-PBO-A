public class App {
    public static void main(String[] args) throws Exception {
        Spider kiti = new Spider();
        kiti.eat();

        Dog guguk = new Dog();
        guguk.setName("snowy");
        System.out.println("Saya adalah " + guguk.getName());
        guguk.play();
        guguk.eat();
        guguk.walk();

        Cat meong = new Cat("Iciro");
        System.out.println("Saya adalah " + meong.getName());
        meong.play();
        meong.eat();
        meong.walk();
    }
}