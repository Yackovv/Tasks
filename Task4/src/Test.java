import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompareStrings compareStrings = new CompareStrings(sc.nextLine(), sc.nextLine());
        System.out.println(compareStrings.getCompareResult());
    }
}