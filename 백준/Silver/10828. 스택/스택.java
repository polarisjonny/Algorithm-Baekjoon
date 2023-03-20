import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
			
			
			if(command.equals("push")) {
				int number = Integer.parseInt(st.nextToken());
				stack.push(number);
			}
			else if(command.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(stack.peek()+"\n");
				}	
			}
			else if(command.equals("size")) {
				sb.append(stack.size()+"\n");
			}
			else if(command.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append(1+"\n");
				} else {
					sb.append(0+"\n");
				}
			}
			else if(command.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1+"\n");
				} else {
					sb.append(stack.pop()+"\n");
				}
			}
		}
        System.out.print(sb);
	}
}