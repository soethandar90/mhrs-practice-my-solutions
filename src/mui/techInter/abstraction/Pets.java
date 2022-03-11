package mui.techInter.abstraction;

abstract class Pets{
    public abstract void talk();
    public void eat(){
        System.out.println("Food");
    }
}

class Cat extends Pets{
    public void talk(){
//implement something
        System.out.println("Cat Jelly");
    }
}

class Dog extends Pets{
    public void talk(){
//implement something
        System.out.println("Snack");
    }
}

class Main{
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat();
        c.talk();
    }
}



