package profit;
import java.util.Scanner;                                        
public class ProfitDemo  {                                       
		 public static void main(String[] args) {                
			    String name;                                     
			    int employee;                                    
			    int salary = 0;                                  
			    int net = 0;                                     
			    int salarynet = 0;                               
			                                                     
	       Scanner Keyboard = new Scanner(System.in);            
		   System.out.print("\n Name : ");                       
		   name = Keyboard.nextLine();                           
			                                                     
		   System.out.print("\n Remuneration received : ");      
		   salary = Keyboard.nextInt();                          
			                                                     
		   if (salary > 25000)                                   
		  {                                                      
		   net = (salary * 1) / 100;                             
		   salarynet=(salary+net);                               
		   System.out.println("\nNet salary: " + salarynet);     
		  }                                                      
		    if (salary > 50000)                                  
		  {                                                      
		   net = (salary * 2) / 100;                             
		   salarynet=(salary+net);                               
		   System.out.println("\nNet salary: " + salarynet);     
		   }                                                     
			else {                                               
		    net = (salary * 3) / 100;                            
			salarynet = (salary + net);                          
			                                                     
			System.out.println("\nNet salary : " + salarynet);   
			}                                                    
			                                                     
	}                                                            
}                                                                