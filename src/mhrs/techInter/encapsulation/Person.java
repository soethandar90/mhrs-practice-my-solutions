package mhrs.techInter.encapsulation;

public class Person {
    private String name;
    private String age;
    public String title;
    protected String protectedInfo;
    String defaultStr;
    //Getter
    public String getName() {
        return this.name;
    }
    //Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

class OtherClass {
    public static void Main(String[] args) {
        Person p = new Person();
        //System.out.println(p.name);//compile error
        System.out.println(p.title); //OK
        System.out.println(p.protectedInfo); //OK, under the same package.
        System.out.println(p.defaultStr); //OK, default is protected.
    }
}

