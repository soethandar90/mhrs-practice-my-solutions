package mui.techInter.polymorphism;

public class Pets {
    public void talk() {
        System.out.println("Hey!!");
    }
}

class Cat extends Pets {
    public void talk() {
        System.out.println("Meow Meow");
        //super.talk();
    }
}

class Dog extends Pets {
    public void talk() {
        System.out.println("Woff Woff");
    }
}

class MainRunner {
    public static void main(String[] args) {
        Pets p = new Pets();
        Pets c = new Cat();
        Pets d = new Dog();
        p.talk();
        c.talk();
        d.talk();
    }
}