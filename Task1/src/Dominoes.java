import java.util.Scanner;
public class Dominoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        NumberOfDominoes numberOfDominoes = new NumberOfDominoes(length, width);
    }
}