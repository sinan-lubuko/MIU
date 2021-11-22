package Chapter5;

public class AppleTest {
    public static void main(String []args){
        Apple app1 = new Apple();
        System.out.println(app1); // Put the obejct inside Sysout will call toString() method
        // Call the getter and setter
        String app1Color = app1.getColor();
        System.out.println("Initail Color of Object app1 : " + app1Color);
        // Modify the color of app1 to Yellow
        app1.setColor("Yellow");
        System.out.println("Modified app1 color = " + app1.getColor());
        Apple app2 = new Apple("Green",1.2,125);
        System.out.println(app2.toString());// ignore the toString()
        // Modify the price of app2
        app2.setPrice(2.33);
        //  print the price of the app2;
        System.out.println(app2.getPrice());
        System.out.println(app2.getWeight());
    }
    }

