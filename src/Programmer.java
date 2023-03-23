public class Programmer extends Person {
    private String companyName;

    public Programmer(){

    }
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println("Haker");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("learn.Germana");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat.wings");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("walk.Kampus");
    }

    @Override
    public String toString() {
        return "Programmer: " +"\n"+
                "companyName: " + companyName + "\n"+
        super.toString();
    }
}

