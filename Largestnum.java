import java.util.*;
class Largestnum {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter number 1 ");
int num1 = in.nextInt();
System.out.print("Enter number 2 ");
int num2 = in.nextInt();
if (num1 > num2) {
System.out.print(" The largest number is : " + num1);
}
else {
System.out.print(" The largest number is : " + num2);
}
}
}

