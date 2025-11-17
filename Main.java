import java.lang.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    //Input:
    System.out.println("Enter the following data: ");
    System.out.print("avgLength phrase1: ");
    String avl1 = input.nextLine();
    System.out.print("avgLength phrase2: ");
    String avl2= input.nextLine();
    System.out.print("firstLastLetter phrase1: ");
    String flp1 = input.nextLine();
    System.out.print("firstLastLetter phrase2: ");
    String flp2 = input.nextLine();
    System.out.print("middleLetter phrase: ");
    String ml = input.nextLine();
    System.out.print("swapFirst phrase1: ");
    String sfp1 = input.nextLine();
    System.out.print("swapFirst phrase2: ");
    String sfp2 = input.nextLine();
    System.out.print("removeAt phrase: ");
    String rmp = input.nextLine();
    System.out.print("removeAt index: ");
    int rmi = input.nextInt();
    System.out.println();
    
    //Output:
    System.out.println("---- Average Length ----");
    System.out.println("Phrase1: " + avl1 + "\nPhrase2: " + avl2 + "\nAverage length: " + StringMethods.avgLength(avl1, avl2));
    System.out.println();
    System.out.println("---- First Last Letter ----");
    System.out.println("Phrase1: " + flp1 + "\nPhrase2: " + flp2 + "\nFirst and last letter: " + StringMethods.firstLastLetter(flp1, flp2));
    System.out.println();
    System.out.println("---- Middle Letter ----");
    System.out.println("Phrase: " + ml + "\nMiddle letter: " + StringMethods.middleLetter(ml));
    System.out.println();
    System.out.println("---- Swap First ----");
    System.out.println("Phrase1: " + sfp1 + "\nPhrase2: " + sfp2 + StringMethods.swapFirst(sfp1, sfp2));
    System.out.println();
    System.out.println("---- Remove At ----");
    System.out.println("Phrase: " + rmp + "\nIndex: " + rmi + "\nUpdated phrase: " + StringMethods.removeAt(rmp, rmi));
    
    
  }
}