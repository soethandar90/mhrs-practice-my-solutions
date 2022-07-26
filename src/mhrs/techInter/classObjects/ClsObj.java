package mhrs.techInter.classObjects;

/*
In Java, an object is created from a class.
We have already created the class named ClsObj,
so now we can use this to create objects.
To create an object of Main, specify the class name,
followed by the object name, and use the keyword new:*/

public class ClsObj {
    int x =10;

    public static void main(String[]args){
        ClsObj myObj = new ClsObj();
        System.out.println(myObj.x);
    }
}
