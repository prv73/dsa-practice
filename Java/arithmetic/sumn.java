import java.util.Scanner;
 
public class sumn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long sum = (n * (n + 1)) / 2;
            System.out.println(sum);
        }
    }
}