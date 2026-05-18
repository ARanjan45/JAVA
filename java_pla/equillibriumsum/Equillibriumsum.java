/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Equillibriumsum
{
    public static int getMax(int [] arr){
        int totalSum=0;
        int prefSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        for(int pivot=0;pivot<arr.length;pivot++){
            int suffSum=totalSum-prefSum-arr[pivot];
            if(prefSum==suffSum){
                
                if(prefSum>=maxSum){
                    maxSum=prefSum;
                }
                prefSum+=arr[pivot];
            }
            prefSum+=arr[pivot];
            
        }
        return maxSum;
    }
    
	public static void main(String[] args) {
		int arr[]={1,3,5,2,2};
		int result=getMax(arr);
		System.out.println(result);
	}
}
