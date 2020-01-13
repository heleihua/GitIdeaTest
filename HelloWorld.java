
import java.util.Date;

/**
 * @created by Administrator at 2020-01-05 23:50
 */
public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args) {
        System.out.println("HELLO World ");
        Date date;
        date = getDate();
        System.out.println("date = " + date);
        System.out.println(date);
        System.out.println(date);
    }

    private static Date getDate() {
        return new Date();
    }

}
