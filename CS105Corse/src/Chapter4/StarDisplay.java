package Chapter4;

public class StarDisplay {

public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5 - i; j++) ;

            System.out.println(" ");

        for (int k = 0; k <= i; k++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
  }
}
