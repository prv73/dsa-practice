import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int a = Integer.parseInt(s.split("[+\\-*/]")[0]);
        int b = Integer.parseInt(s.split("[+\\-*/]")[1]);

        char op = ' ';

        for(char c : s.toCharArray()) {
            if(c == '+' || c == '-' || c == '*' || c == '/') {
                op = c;
                break;
            }
        }

        if(op == '+')
            System.out.println(a + b);
        else if(op == '-')
            System.out.println(a - b);
        else if(op == '*')
            System.out.println(a * b);
        else
            System.out.println(a / b);
    }
}