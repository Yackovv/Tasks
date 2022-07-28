import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringChanger stringChanger = new StringChanger();
        System.out.println(stringChanger.getChangerString(str));
    }
}