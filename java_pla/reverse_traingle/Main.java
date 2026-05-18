/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
		    for(int j=0;j<num;j++){
		        if((i+j)>=num-1)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		            
		    }
		    System.out.println("");
		    
		}
	}
}
