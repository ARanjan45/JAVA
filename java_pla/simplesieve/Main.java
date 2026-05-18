/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void SimpleSieve(int limit){
        boolean []arr=new boolean[limit+1];
        for(int i=2;i<=limit;i++){
            arr[i]=true;
        }
        //Mark all the multiples of primes as composite
        for(int p=2;p*p<=limit;p++){
            if(arr[p]==true){
                for(int i=p*p;i<=limit;i+=p){
                    arr[i]=false;
                }
            }
        }
        for(int p=2;p<=limit;p++){
            if(arr[p]==true){
                System.out.print(p+" ");
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int limit=sc.nextInt();
		
		SimpleSieve(limit);
	}
}
