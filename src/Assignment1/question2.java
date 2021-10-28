package Assignment1;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("");
		    System.out.println("Red");
		    System.out.println("Yellow");
		    System.out.println("Green");
		    
		    
		  System.out.println("Select Color =1.Red 2.Yellow 3.Green");
		    Scanner sc=new Scanner(System.in);  
		    
		    int color = sc.nextInt();
		   
		 
		    switch (color) 
		    {
		    case 1:
		    
		    System.out.println("Stop");
		    break;
		    
		    case 2:
		        
		    System.out.println("Ready");
		    break;
		    
		        
		    case 3:
		     
		        System.out.println("Go");
		        break;
		    }
	}

}
