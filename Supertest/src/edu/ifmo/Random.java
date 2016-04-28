/**
 * 
 */
package edu.ifmo;

/**
 * 
 */

/**
 * @author Maithuong
 *
 */
public class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int[][] Mas = new int[4][3];
	        
	        for(int i=0;i<Mas.length;i++){
	            for(int j=0;j<Mas[i].length;j++){
	                Mas[i][j]=(int)(Math.random()*90)+10;
	                System.out.print(Mas[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	     }
	} 
