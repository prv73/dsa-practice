import java.util.Scanner;
 
public class circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double R = sc.nextDouble();
            double PI = 3.141592653;
            double area = PI * R * R;
            
            System.out.printf("%.9f", area);
        }     
    }
}