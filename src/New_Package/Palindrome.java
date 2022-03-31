package New_Package;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
				int r,sum=0,temp; 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter The Number");
				 //int n=454;//It is the number variable to be checked for palindrome  
				  int n = sc.nextInt();
				  temp=n;    
				  while(n>0){    
				   r=n%10;  //getting remainder  
				   sum=(sum*10)+r;    
				   n=n/10;    
				  }   
				  sc.close();
				  if(temp==sum)    
				   System.out.println("palindrome number ");    
				  else    
				   System.out.println("not palindrome"); 

			}



	}
