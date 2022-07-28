import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortNumbers sortNumbers = new SortNumbers();
        System.out.println(sortNumbers.Result(sc.nextLine()));
    }
}