import java.util.*;
class SI {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter the principal amount : ");
int num1 = in.nextInt();
System.out.print("Enter the rate : ");
int num2 = in.nextInt();
System.out.print("Enter the time : ");
int num3 = in.nextInt();
int SI = (num1 * num2 * num3)/100;
System.out.print(" The calculated Simple interest is = " + SI );
}
}

