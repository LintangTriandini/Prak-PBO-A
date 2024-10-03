class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void play() {
        System.out.println("Sedang Bermain Bola");
    }

    public void eat() {
        System.out.println("Sedang Makan Daging");
    }

    @Override
    public void walk() {
        System.out.println("Sedang Jalan bersama Majikan");
    }
}