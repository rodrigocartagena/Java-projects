public class StringMethods {

  private String str1;
  private String str2;

  public StringMethods(){
    this.str1=str1;
    this.str2=str2;
  }
  public static double avgLength (String str1, String str2 ){
   return (str1.length() +str2.length()) / 2.0;
  }
  public static String firstLastLetter(String str1, String str2){
    int p = str2.length();
    return str1.substring(0,1) + str2.substring(p-1);
  }
  public static String middleLetter(String str1){
   return str1.substring(str1.length()/2, (str1.length()/2)+1);
  }
  public static String swapFirst(String str1, String str2){
    String first1 = str1.substring(0, 1);
    String first2 = str2.substring(0, 1);

    String newStr1 = first2 + str1.substring(1);
    String newStr2 = first1 + str2.substring(1);

    return "Swap1: " + newStr1 + "\nSwap2: " + newStr2;
  }
  public static String removeAt(String str1, int inde){
      return str1.substring(0,inde) + str1.substring(inde + 1, str1.length());
  }
  }
