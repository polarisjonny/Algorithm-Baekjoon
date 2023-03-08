import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d = new Date();
        
        String nowTime = sdf1.format(d);
        
        System.out.println(nowTime);
    }
}