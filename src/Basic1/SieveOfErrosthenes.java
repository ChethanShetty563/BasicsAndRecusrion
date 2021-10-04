package Basic1;

import java.util.Scanner;

public class SieveOfErrosthenes {
	public static void main(String args[]) {
	       Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       primesLessThanOrEqualTon(n);
	   }
	
	static void primesLessThanOrEqualTon(int n) {
	       // Write your code here
	       
	       if(n < 2) {
	           System.out.print("There are no prime numbers less than or equal to " + n);
	           return;
	       }
	       
	       boolean prime[] = new boolean[n+1];
	       
	       for(int i=0;i<=n;i++) {
	           prime[i] = true;
	       }
	       
	       for(int p=2; p *p<=n;p++) {
	           
	           if(prime[p] == true) {
	               for(int i=p*p;i<=n;i = i+p) {
	                   prime[i] = false;
	               }
	           }
	       }
	       
	       for(int i=2;i<=n;i++) {
	           if(prime[i] == true) {
	               System.out.print(i + " ");
	           }
	       }
	   }

}
