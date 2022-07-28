import java.util.Scanner;

public class Matrix {
    private int x;
    private int y;

    public void findOne(){
      Scanner sc = new Scanner(System.in);
      for(int i = 4; i >= 0; i--){
          String tempStr = sc.nextLine().replace(" ", "");
          if(tempStr.contains("1")){
              y = i;
              x = tempStr.indexOf("1");
          }
      }
    }
    public int getNumberSteps(){
        findOne();
        return Math.abs(x - 2) + Math.abs(y - 2);
    }
}