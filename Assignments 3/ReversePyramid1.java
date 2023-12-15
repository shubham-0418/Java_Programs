/**
*	 Pyramid reverse
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
**/

class ReversePyramid1{
	public static void main(String[] args){
	int n = 5;
	for(int i=1;i<n;i++){
		for(int k=0;k<i-1;k++){
			System.out.print(" ");
		}
		
		for(int j=1;j<=n-i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=2;i<=n-1;i++){
		for(int k=0;k<n-i-1;k++){
			System.out.print(" ");
		}
		
		for(int j=0;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}
}