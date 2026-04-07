import java.util.Scanner;
class ArithmeticOperations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number = ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number = ");
		double b = sc.nextDouble();
		double add = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double rem = a%b;
		System.out.println("Addition = "+add);
		System.out.println("Subtraction = "+sub);
		System.out.println("Multiplication = "+mul);
		if(b>0){
		System.out.println("division = "+ div);
		}
else{
System.out.println("b can not be zero");
}
		System.out.println("Remainder = "+rem);
		
	}
}	