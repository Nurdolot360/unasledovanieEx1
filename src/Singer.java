public class Singer extends Person {
    private String bandName;

    public  Singer(){

    }
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("singing.gitar");
    }
    public void playGitar(){
        System.out.println("playGitar.well");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("learn.musucShkool");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("walk.bandMusic");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat.Tort");
    }

    @Override
    public String toString() {
        return "Singer: " + "\n"+
                "bandName: " + bandName + "\n"+super.toString();
    }
}
