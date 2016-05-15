/**
 * 
 */
package edu.ifmo;

/**
 * @author Maithuong
 *
 */
import java.util.Scanner;
public class Test {
	 
	
	public static void main(String[] args){
		String description = "This is s simple software.";
		 String descriptionCommand = "-d";
		 String sayName = "Say about your ";
		 String sayNameCommand = "-hello";
		 String sayThanks="Hello!";
		 String name;
		
	
		Scanner in = new Scanner(System.in);
		if(args.length !=0){
			if (args[0].equals("-d")){
				System.out.print("Description:"+description);
			}else if (args[0].equals(sayNameCommand)){
				System.out.print(sayName);
				name = in.next();
				System.out.print(sayThanks +"В магазинах «Skirts Shop» представлена стильная одежда для девушек и парней");
			}
		}
	}
}
		
//		Scanner in = new Scanner(System.in);
		//		System.out.print("Введите сообщение:");
		//		while(in.hasNext()){
		//			String s = in.next();
		//			if(s.equals("exit")){
		//				break;
		//}
		//String[] s1 = s.split("\\.");
		//for(int i=0;i<s1.length;i++){
		//	System.out.print(i+")"+ s1[i]+", ");
		//}
		//System.out.println();
		//System.out.print("Введите сообщение:");
		//}
		//System.out.print("Программа завершена");
		