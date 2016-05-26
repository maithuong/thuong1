/**
 * 
 */
package count.example;
import count.example.Car;
/**
 * @author Maithuong
 *
 */
public class Import {
	public static void main(String args[]){
	      /* Create two objects using constructor */
	      Car empOne = new Car("James Smith");
	      Car empTwo = new Car("Mary Anne");

	      // Invoking methods for each object created
	      empOne.empAge(26);
	      empOne.empDesignation("Senior Software Engineer");
	      empOne.empSalary(1000);
	      empOne.printEmployee();

	      empTwo.empAge(21);
	      empTwo.empDesignation("Software Engineer");
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	   }
}
