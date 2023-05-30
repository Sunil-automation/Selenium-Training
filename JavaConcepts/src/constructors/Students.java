package constructors;

public class Students {
	
	/* Constructor have same name as of the class name
	 * 
	 * Types Of constructor:
	 * 
	 * default constructor
	 * no-arg constructor
	 * parametarizied constructor
	 *  
	 * 
	 */
	
	
	  public Students(){
	  
	  System.out.println("Calling constructor"); }
	 
	  public Students(int i) {
		  System.out.println(i);
	  }
	
	
	 String studentName;
	 int rollNum;
	
	
	 public Students(String studentName, int rollNum) {
		//new Students();
		this(10); //constructor chaining
		this.studentName =studentName;
		this.rollNum = rollNum;
		
	 }
	

	 public static void main(String[] args) {
		
		
		Students st = new Students("Rahul", 101);
		System.out.println(st.studentName);
		System.out.println(st.rollNum);
		//new Students();
		

	}

}
