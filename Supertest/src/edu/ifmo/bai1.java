/**
 * 
 */
package edu.ifmo;

/**
 * @author Maithuong
 *
 */
public class bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=8.5;
        double m=11.45;
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);  
        if (b==c){
            System.out.println("Ð§Ð¸Ñ�Ð»Ð° "+n +" Ð¸ "+m + " Ñ€Ð°Ð²Ð½Ð¾ÑƒÐ´Ð°Ð»ÐµÐ½Ñ‹ Ð¾Ñ‚ "+a);
        }
        if(b>c){
            System.out.println("Ð§Ð¸Ñ�Ð»Ð¾ "+m+" Ð±Ð»Ð¸Ð¶Ðµ Ðº "+a);
        }
        if (b<c) {
            System.out.println("Ð§Ð¸Ñ�Ð»Ð¾ "+n+" Ð±Ð»Ð¸Ð¶Ðµ Ðº "+a);
        }
    }

}
