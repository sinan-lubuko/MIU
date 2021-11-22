package sale_and_discount;

public class Derived extends Parent{

    void myMethod(){
        System.out.println("Derived class");
    }

    public static void main(String[] args){
        //UpCasting
        //Derived object = new Parent();

        Parent object = new Derived();
        object.myMethod();

        //down casting
        Derived derived = new Derived();
        Parent parent = derived; // Parent parent = new Derived();
    }
}
