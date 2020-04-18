
//Vtricks Edtech
//Vinay Haritsa
//Vtu lab prog 3b

// import Random package for Random Numbers
import java.util.Random;

// Creating a number class and inheriting Thread class
class Number extends Thread
{
	// overriding the function run from Thread class
	 public void run()
	 {
		 // create a random class for random number generation
		 Random random = new Random();
		 for(int i =0; i<10; i++)
		 {
			 
			 int randomInteger = random.nextInt(100);
			 System.out.println("Random Integer generated : " + randomInteger);
			 int square = randomInteger*randomInteger;
			 System.out.println(" Square of a number is "+square);
			 int cube=randomInteger*randomInteger*randomInteger;
			 System.out.println(" Cube of a number is "+cube);
			 try 
			 {
				 Thread.sleep(1000);
			 } 
			 catch (InterruptedException ex) 
			 {
				 System.out.println(ex);
			 }
		 }
	 }
}

// main class and creating a Number object in it

public class ThreadExample
{

	public static void main(String[] args) 
	{
		Number n1=new Number();
		n1.start();
       
	}
}
