package GqtCodes;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int n=sc.nextInt();
		
		// TODO Auto-generated method stub
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(j==0||(i==0 && j<=n/2)||(j==n/2 && i<=n/2)||(i==n/2 && j<=n/2)||(i-j==n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			 
			for(int j=0;j<=n-1;j++) {
				if(j==0||j==n/2||(i==0 && j<=n/2)||(i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			 
			for(int j=0;j<=n-1;j++) {
				if(j==0||(j==n/2 &&i!=0 && i!=n-1)||(i==0 && j<=n/2 && j!=n/2)||(i==(n-1) && j<=n/2 && j!=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			 
			for(int j=0;j<=n-1;j++) {
				if(j==0||j==n/2||(i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			 
			for(int j=0;j<n-1;j++) {
				if(i==0||i==n-1||j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("       ");
			System.out.print("  ");
			for(int j=0;j<=n-1;j++) {
				if(j==0||i+j==n/2||i-j==n/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<=n-1;j++) {
				if(j==0||j==n/2||(i==0 && j<=n/2)||(i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			 
			System.out.println(" ");
		}
	}
}
