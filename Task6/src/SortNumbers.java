import java.util.Arrays;

public class SortNumbers {
    public String Result(String str) {
        String[] arrStr = str.split("\\+");
        Arrays.sort(arrStr);
        String result = "";
        for (int i = 0; i < arrStr.length; i++) {
            if (i < arrStr.length - 1) {
                result = result + arrStr[i] + "+";
            } else {
                result = result + arrStr[i];
            }
        }
        return result;
    }
}