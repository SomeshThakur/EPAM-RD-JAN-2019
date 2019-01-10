import java.util.Scanner;

public class ArraySumAvg{
	public static int ArraySum(int array[]) {
		int result = 0;
		for (int value:array) {
			result += value;
		}
		return result;
	}
	
	public static int ArrayAvg(int array[]) {
		int result = ArraySum(array);
		result = result/array.length;
		return result;
	}
	public static void readArray(Scanner scan,int array[]) {
		for (int index=0;index<array.length;index++) {
			array[index]=scan.nextInt();
		}
	}
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int size;
			System.out.println("Enter Size of Array : ");
			size = scan.nextInt();
			int array[] = new int[size];
			System.out.println("Enter Array Values :");
			readArray(scan,array);
			System.out.println("Sum of Array : "+ArraySum(array));
			System.out.println("Average of Array : "+ArrayAvg(array));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}