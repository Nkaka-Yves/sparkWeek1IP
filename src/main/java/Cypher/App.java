package Cypher;
import java.util.Scanner;
public class App {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String enteredMessage = new String();
      String keyString = new String();
      Integer key;
      System.out.println("Welcome to this program!!!!");
      System.out.println("============================");
      System.out.println("Enter any word to Encrypt:");
      enteredMessage = scanner.next();

      System.out.println("Enter Encryption key:");
      keyString = scanner.next();
      key =Integer.parseInt(keyString);
      System.out.println(Cypher.Cypher(enteredMessage,key));
      System.out.println(Dicypher.Dicypher(Cypher.Cypher(enteredMessage,key),key));
      scanner.close();
  }
}
