class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);      
 for(i=2;i<count;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }
}
} 



// OUTPUT:-
  
//   0 1 1 2 3 5 8 13 21 34
