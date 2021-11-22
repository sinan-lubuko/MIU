package Chapter2;

public class PrecedenceRule {
    public static void main (String []args){
        int u = 2, v = 3, w = 5, x = 7, y = 11;
        System.out.println(u+v*w+x);
        System.out.println(u+y%v*w+x);
        System.out.println(u++/v+u++*w);


    }
}
