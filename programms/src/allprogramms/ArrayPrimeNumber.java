package allprogramms;
public class ArrayPrimeNumber {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int count=0;
	System.out.println("prime numbers present in array are:");
	for(int j=0;j<a.length;j++) 
	{
       for(int k=1;k<=a[j];k++) 
       {
    	   if(a[j]%k==0) { 
    		   count++;
    	  }
       }
       if(count==2) 

    	   System.out.print( (a[j]) + ",");
       count=0;
    }
      
       }
	}
	


