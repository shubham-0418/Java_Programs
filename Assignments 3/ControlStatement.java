import java.util.*;
public class ControlStatement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for(int i = number;i>0;i--){
			System.out.print(i+" ");
			sum +=i;
		}
		System.out.print(", " +sum);
	}
}