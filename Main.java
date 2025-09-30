import java.util.Scanner;

public class Main
{

  public static String lastFirstN(String s1, String s2, int n)
  {
    String lastN = s1.substring(s1.length() - n);
    String firstN = s2.substring(0, n);
    String endWord = lastN + firstN;
    return endWord;
  }

  public static void stringManip(String str1, String str2)
  {
    System.out.println(str1.toUpperCase());
    
    String firstLetter = str2.substring(0,1);
    String restLetters = str2.substring(1);
    System.out.println(firstLetter.toUpperCase() + restLetters.toLowerCase());
  }

  public static String removeStr(String s1, String s2)
  {
    int index = s1.indexOf(s2);
    int s2length = s2.length();
    String changed1 = s1.substring(0, index);
    String changed2 = s1.substring(index + s2length);
    String finalchanged = changed1 + changed2;

    return finalchanged;
  }

  public static void main(String[] args)
  {
    // Problem 1
    Scanner scan = new Scanner(System.in);
    System.out.print("enter 2 strings and a number: ");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();
    int num = scan.nextInt();
    scan.nextLine();
    System.out.println("combined string: " + lastFirstN(word1, word2, num));

    //Problem 2
    System.out.print("\nenter two strings: ");
    String fullUpper = scan.nextLine();
    String halfedUpLow = scan.nextLine();
    stringManip(fullUpper, halfedUpLow);

    // Problem 3
    System.out.println("\nEnter two words - word1 will have word2 truncated from it: ");
    String sub1 = scan.nextLine();
    String sub2 = scan.nextLine();
    System.out.println("altered string: " + removeStr(sub1, sub2));


      
  }
}
