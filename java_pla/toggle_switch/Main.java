/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean [] b=new boolean[n+1];
		int i, j, o=0, c=0;
		for(i=1;i<=n;i++){
		    for(j=i;j*i<=n;j++){
		        if(b[j]==false)
		            b[j]=true;
		        else
		            b[j]=true;
		    }
		}
		for(i=1;i<=n;i++){
		    if(b[i]==true){
		        o++;
		    }
		    else{
		        c++;
		    }
		}
		System.out.println(c);
		System.out.println(o);
		
	}
}
