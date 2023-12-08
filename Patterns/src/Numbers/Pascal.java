package Numbers;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			int num=1;
			for(int k=0;k<=i;k++) {
				System.out.print(num+" ");
				num=num*(i-k)/(k+1);   		//Pascal's formula	
			}
			System.out.println();
		}
		sc.close();

	}

}
