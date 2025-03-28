import java.util.*;
class Fibonacci {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = in.nextInt();
if (n <= 0) {
System.out.print("Please enter a positive integer");
return;
}
int a = 0;
int b = 1;
int count = 2;
if (n >= 1) {
System.out.print( a + " ");
}
if (n >= 2) {
System.out.print( b + " ");
}

while ( count < n ) {
int temp = b;
b = b + a ;
System.out.print(b + " ");
a = temp;
count ++;
}
}
}