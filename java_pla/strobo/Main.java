/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static boolean strobo(String num){
        Map<Character,Character>map=new HashMap<Character,Character>();
        map.put('1','1');
        map.put('6','9');
        map.put('9','6');
        map.put('8','8');
        map.put('0','0');
        int l=0,r=num.length()-1;
        while(l<=r){
            if(!map.containsKey(num.charAt(l)))
                return false;
            if(map.get(num.charAt(l))!=num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
        
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
		System.out.println(strobo(s));
	}
}
