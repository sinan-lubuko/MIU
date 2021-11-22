package Chapter5;

public class ComputerTestClass {
    public static void main(String []args){
        Computer computer1 = new Computer("Apple","intel",2,5.6);
        Computer computer2 = new Computer("Apple","intel", 3,2.5);
        Computer computer3 = new Computer("Apple","intel",4,2.6);
        computer1.toString();
        System.out.println(computer1.toString());
        int ram = computer1.getRamSize();
        System.out.println(ram);
        double power  =  computer1.computePower();
        System.out.println(power);
        computer2.toString();
        System.out.println(computer2.toString());
       boolean res = computer1.equals(computer2);
        System.out.println(res);

    }
}
