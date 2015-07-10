package sjta1;

import java.util.Scanner;

public class sjta1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三角形行数");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
			System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
