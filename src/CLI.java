import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLI {
	
	static Calculator calcRunner = new Calculator();
	
	public static void selectMethod() throws IOException{
		boolean quit = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(quit == false){
		    System.out.print("Do you want to add, subtract, multiply, divide or quit? For help type 'help' \n");
		    String selectedMethod = br.readLine();
		    
		    if(selectedMethod.equals("add")){
		    	System.out.print("What's the first integer that you want to add?"+"\n");
		    	int a = Integer.parseInt(br.readLine());
		    	System.out.print("What's the second integer that you want to add?"+"\n");
		    	int b = Integer.parseInt(br.readLine());
		    	System.out.println("= "+calcRunner.pressAdd(a,b)+"\n");
		    }
		    if(selectedMethod.equals("subtract")){
		    	System.out.print("What's the first integer that you want to subtract?"+"\n");
		    	int a = Integer.parseInt(br.readLine());
		    	System.out.print("What's the second integer that you want to subtract?"+"\n");
		    	int b = Integer.parseInt(br.readLine());
		    	System.out.println("= "+calcRunner.pressSubtract(a,b));
		    }
		    if(selectedMethod.equals("multiply")){
		    	System.out.print("What's the first integer that you want to multiply?"+"\n");
		    	int a = Integer.parseInt(br.readLine());
		    	System.out.print("What's the second integer that you want to multiply?"+"\n");
		    	int b = Integer.parseInt(br.readLine());
		    	System.out.println("= "+calcRunner.pressMultiply(a,b));
		    }
		    if(selectedMethod.equals("divide")){
		    	System.out.print("What's the first integer that you want to divide?"+"\n");
		    	int a = Integer.parseInt(br.readLine());
		    	System.out.print("What's the second integer that you want to divide?"+"\n");
		    	int b = Integer.parseInt(br.readLine());
		    	System.out.println("= "+calcRunner.pressDivide(a,b));
		    }
		    if(selectedMethod.equals("help")){
		    	System.out.print("help: To perform a calculator function, type the function name in lower case. 'add', 'subtract' etc...no spaces or parentheses. "
		    			+ "Also, make sure that the numbers you are inputting are integers, no decimal points or "
		    			+ "characters other than numbers.\n");
		    }
		    if(selectedMethod.equals("quit")){
		    	System.out.print("You've ended the program. Haters gonna hate and ain'ters gonna ain't.");
		    	quit = true;
		    }
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		selectMethod();
		
	}
}
