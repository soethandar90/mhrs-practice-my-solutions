package mhrs.techInter.interfaces;

interface Pets{
    public void talk();
    public void eat();
}

class Cat implements Pets{
    public void talk(){
        System.out.println("Meow Meow");
    }
    public void eat(){
        System.out.println("Royal Canin Cat Jelly");
    }
}

class Dog implements Pets{
    public void talk(){
        System.out.println("Woff Woff");
    }
    public void eat(){
        System.out.println("Bone Snack");
    }
}

class Main{
    public static void main(String[] args){
        Cat c = new Cat();
        Dog d = new Dog();
        c.talk();
        c.eat();

        d.talk();
        d.eat();
    }

}
