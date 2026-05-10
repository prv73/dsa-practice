package Java.digits;

import java.util.Scanner;
 
public class dig {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            int lastDigitN = (int)(N % 10);
            int lastDigitM = (int)(M % 10);
            System.out.println(lastDigitN + lastDigitM);
        }
    }
}
