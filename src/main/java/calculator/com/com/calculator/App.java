package calculator.com.com.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return b-a;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return b/a;
	}
	
    public static void main( String[] args )
    {
    	App c = new App();
       int a = 10;
       int b = 20;
       System.out.println(c.sum(a,b));
       System.out.println(c.sub(a, b));
       System.out.println(c.multiply(a, b));
       System.out.println(c.divide(a, b));
       
       
    }
}
