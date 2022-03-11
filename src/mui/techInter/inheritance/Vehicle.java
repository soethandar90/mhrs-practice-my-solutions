package mui.techInter.inheritance;

public class Vehicle {
    private String company = "Elon";
    protected String company2 = "Elon Musk";

    public String getModel() {
        return this.company;
    }

    public void setModel(String newModel) {
        this.company = newModel;
    }

    private void charge1() {
        System.out.println("Charging1....");
    }

    protected void charge2() {
        System.out.println("Charging2....");
    }

    public void charge3() {
        System.out.println("Charging2....");
    }
}

class Car extends Vehicle {
    private String carName = "New Revolution";

    public static void main(String[] args) {
        Car c = new Car();
        //c.charge1(); //compile error
        c.charge2(); //OK
        c.charge3(); //OK
        System.out.println(c.carName);//New Revolution
        //System.out.println(c.company);//compile error
        System.out.println(c.company2);//Elon Musk
    }
}
