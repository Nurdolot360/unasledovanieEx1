public class Dancer extends Person {
    private String groupaName;
    public Dancer (){

    }
    public Dancer(String name, String designation, String groupaName) {
        super(name, designation);
        this.groupaName = groupaName;
    }

    public String getGroupaName() {
        return groupaName;
    }

    public void setGroupaName(String groupaName) {
        this.groupaName = groupaName;
    }
    public void dancing(){
        System.out.println("dancong.lezinka");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("leaen.DancerShkool");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("walk.dan");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat.salad");
    }

    @Override
    public String toString() {
        return "Dancer: " + "\n"+
                "groupaName: " + groupaName + "\n"+super.toString();
    }
}
