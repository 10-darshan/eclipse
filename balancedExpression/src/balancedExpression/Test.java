package balancedExpression;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BalancedParanthesis bp=new BalancedParanthesis();
		String expr = "([{}]))"; 
        if (BalancedParanthesis.areParanthesisBalanced(expr)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 

	}

}
