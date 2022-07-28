import java.util.Scanner;

public class VariableX {
    private int x;

    public int getValueX (int numberOfSentence){

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numberOfSentence; i++){
            String iterator = sc.nextLine();
            if(iterator.contains("++") && iterator.toLowerCase().contains("x")){
                x++;
            } else if(iterator.contains("--") && iterator.toLowerCase().contains("x")){
                x--;
            } else {
                System.out.println("Ошибка");
            }
        }
        sc.close();
        return x;
    }
}