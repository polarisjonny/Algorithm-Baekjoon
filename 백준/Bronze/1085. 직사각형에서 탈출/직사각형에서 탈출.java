import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //한수가 위치한 x 좌표의 위치
        int x = scanner.nextInt();
        
        //한수가 위치한 y 좌표의 위치
        int y = scanner.nextInt();
        
        //오른쪽 위 꼭짓점 x좌표
        int w = scanner.nextInt();
        
        //오른쪽 위 꼭짓점 y좌표
        int h = scanner.nextInt();
        
        scanner.close();
        
        //x축 최소값
        int heightX = Math.min(x, w - x);
        
        //y축 최솟값
        int heightY = Math.min(y, h - y);
        
        //가장 작은 값이 경계선으로 가는 가장 작은 거리다
        System.out.println(Math.min(heightX, heightY));
    }
    
}