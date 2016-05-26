/**
 * 
 */
package edu.itmo.examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author Maithuong
 *
 */
public class TestException {
	public static void testException(){
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testException();
		try {
			String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
			throw new IOException("any");
		} catch (IOException e){
			System.out.println("error");
			
		}catch (Exception e){
			System.out.println("generic exceptionn");
		}
}
}
