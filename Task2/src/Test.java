import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        VariableX result = new VariableX();
        System.out.println(result.getValueX());

    }
}
class VariableX {
    private int x;

    public int getValueX() {

        Scanner sc = new Scanner(System.in);
        int numberOfSentence = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfSentence; i++) {
            String iterator = sc.nextLine();
            if (iterator.contains("++") && iterator.toLowerCase().contains("x")) {
                x = x + 1;
            } else if (iterator.contains("--") && iterator.toLowerCase().contains("x")) {
                x = x - 1;
            }
        }
        sc.close();
        return x;
    }
}