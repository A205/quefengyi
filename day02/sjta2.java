package sjta2;
import java.util.Scanner;
public class sjta2 {
	public static void main(String[] args) {
		System.out.println("输入三角形行数");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n<10){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
			
				System.out.print(i);
				}
				System.out.println(" ");
			}
						
		}
		else
			for(int i=1;i<=9;i++){
				for(int j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=i*2-1;j++){
					System.out.print(i);
				}
				System.out.println("");
			}
			for(int i=10;i<=n;i++){
				for(int j=1;j<=n-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=i*2-1;j++){
					char arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
					System.out.print(arr[i-10]);
				}
					System.out.println("");
				}
		}
	
	}

	
	
					



