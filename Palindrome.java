import java.util.*;
class Palindrome {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter a string : ");
String input = in.nextLine();
String reversed = ""; //starting with an empty string
for (  int i = input.length() - 1 ; i >= 0 ; i--) {
reversed = reversed + input.charAt(i) ;
}
if (input.equals(reversed)) {
System.out.print("The string is a Palindrome");
}
else {
System.out.print("The string is not a Palindrome");
}
}
}

