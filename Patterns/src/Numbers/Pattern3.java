package Numbers;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((i+j)+" ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
