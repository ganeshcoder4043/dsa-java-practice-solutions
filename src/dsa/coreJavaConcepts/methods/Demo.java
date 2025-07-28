package dsa.coreJavaConcepts.methods;

public class Demo {


	    
	    // method with return type and parameters
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // method without return value (void)
	    public void greet() {
	        System.out.println("Hello from Calculator!");
	    }

	    public static void main(String[] args) {
	    	Demo calc = new Demo();
	        System.out.println(calc.add(10, 20));
	        calc.greet();
	    }



}
