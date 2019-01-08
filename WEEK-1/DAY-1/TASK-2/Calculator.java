import java.util.*;
import java.lang.*;

public class Calculator{
	/* Funtion for Addition */
	public static int add(int x,int y){
		return x+y;
	}
	
	/* Funtion for Subtraction */
	public static int sub(int x,int y){
		return x-y;
	}
	
	/* Funtion for Multiplication */
	public static int mul(int x,int y){
		return x*y;
	}
	
	/* Funtion for Division */
	public static int div(int x,int y){
		return x/y;
	}
	
	public static void main(String[] args){
		int ch=1,curr=0,tmp=0;
		/*
			ch - Choice of user
			curr - Current value of answer
			tmp - Temporary insput storage
		*/
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("-----------------------------");
			System.out.println("[ "+curr+" ]");
			System.out.println("-----------------------------");
			System.out.println("1. Addition");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Clear");
			System.out.println("6. Exit");
			System.out.println("Enter your choice : ");
			try{
				ch = scan.nextInt();
			}catch(Exception e){
				e.printStackTrace();
			}
			switch(ch){
				case 1:
					System.out.println("Enter Number : ");
					try{
					tmp = scan.nextInt();
					}catch(Exception e){
					e.printStackTrace();
					}
					curr = add(curr,tmp);
					break;
				case 2:
					System.out.println("Enter Number : ");
					try{
					tmp = scan.nextInt();
					}catch(Exception e){
					e.printStackTrace();
					}
					curr = sub(curr,tmp);
					break;
				case 3:
					System.out.println("Enter Number : ");
					try{
					tmp = scan.nextInt();
					}catch(Exception e){
					e.printStackTrace();
					}
					curr = mul(curr,tmp);
					break;
				case 4:
					System.out.println("Enter Number : ");
					try{
					tmp = scan.nextInt();
					}catch(Exception e){
					e.printStackTrace();
					}
					curr = div(curr,tmp);
					break;
				case 5:
					curr = 0;
					break;
				case 6:
					System.out.println("Good Bye!!");
					break;
				default:
					System.out.println("ERROR : Enter correct option!");
			}
		}while(ch!=6);
	}
}