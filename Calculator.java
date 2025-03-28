import java.util.*;
class Calculator {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter num1 ");
int num1 = in.nextInt();
System.out.print("Enter Operator");
String Operator = in.next();
System.out.print("Enter num2 ");
int num2 = in.nextInt();
if (Operator.equals("+")) {
System.out.print("Answer is " + (num1 + num2));
}
else if (Operator.equals("-")) {
System.out.print("Answer is " + (num1 - num2));
}
else if (Operator.equals("*")) {
System.out.print("Answer is " + (num1 * num2));
}
else if(Operator.equals("/")) {
if ( num2!=0 ){
System.out.print("Answer is " + (num1 / num2));}
else {
System.out.print("Division with 0 is not allowed");
}
}
else {
System.out.print(" Invalid Operator");
}
}
}

