import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfSentence = sc.nextInt();
        VariableX result = new VariableX();
        System.out.println(result.getValueX(numberOfSentence));
    }
}