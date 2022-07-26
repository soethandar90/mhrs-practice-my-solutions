package mhrs.techInter.encapsulation.otherPackage;

import mhrs.techInter.encapsulation.Person;

public class ExternalClass2 {
    public static void main(String[] args){
        Person p2 = new Person();
        System.out.println(p2.title); //OK
        //System.out.println(p2.age); //compile error
        //System.out.println(p2.name); //compile error
        //System.out.println(p2.protectedInfo); //compile error, not under the same package.
        //System.out.println(p2.defaultStr); //compile error, default is protected.
    }
}
