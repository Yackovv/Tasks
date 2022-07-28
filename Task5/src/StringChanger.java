public class StringChanger {
    public String deleteVowels(String str){
        final String vowels = "aoyeui";
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(vowels.contains(String.valueOf(str.charAt(i)))){
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }
        }
        return str;
    }
    public String addPoint(String str){
        String newString = "";
        for(int i = 0; i < str.length(); i++){
            newString = newString +"."+ str.charAt(i);
        }
        return newString;
    }
    public String getChangerString(String str){
        str = deleteVowels(str);
        return addPoint(str);
    }
}