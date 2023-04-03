import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int K = scanner.nextInt();

        for(int i = 0; i < K; i++) {
            int num = scanner.nextInt();

            if(num == 0 && stack.empty()) {
                continue;
            }
            else if(num == 0 && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;

        for(int x : stack) {
            sum += x;
        }

        System.out.println(sum);
    }
}