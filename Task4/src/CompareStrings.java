public class CompareStrings {

    private String str1;
    private String str2;

    public CompareStrings(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
    public int getCompareResult(){
        int result = str1.compareToIgnoreCase(str2);
        return Integer.compare(result, 0);
    }
}