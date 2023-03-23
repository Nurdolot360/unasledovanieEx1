public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setName("Nurdolot");
        programmer.setCompanyName("orackl");
        programmer.setDesignation("developer");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer);

        Dancer dancer = new Dancer();
        dancer.setName("Aidai");
        dancer.setGroupaName("lenous");
        dancer.setDesignation("britans");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer);

        Singer singer = new Singer();
        singer.setName("Djeison");
        singer.setDesignation("music");
        singer.setBandName("bleck set");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer);
        }
}
