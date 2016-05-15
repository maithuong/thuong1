package com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EmailServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		String checkField = "";
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String result = "";
		checkField = checkMail(email);
		if (checkField != "")
			result += checkField + "<br>";
		checkField = checkPassword(password);
		if (checkField != "")
			result += checkField + "<br>";
		checkField = checkName(name);
		if (checkField != "")
			result += checkField + "<br>";
		checkField = checkPhone(phone);
		if (checkField != "")
			result += checkField + "<br>";
		checkField = checkGender(gender);
		if (checkField != "")
			result += checkField + "<br>";
		resp.getWriter().println(result);
	}	

	private static String checkMail(String email) {
		Boolean atsymb = false;
		Boolean dotsymb = false;
			if (email.length() == 0)
				return "Email field is empty";
			if (email.length() > 20)
				return "Email is too long. The limit is 20 symbols";
			for (char symbol:email.toCharArray()) {
				if (symbol == '@')
					atsymb = true;
				if (symbol == '.' && atsymb)
					dotsymb = true;			
			}
			if (!dotsymb)
				return "Email is incorrect";
			return "";
		}

		private static String checkPassword(String password) {
			Boolean digit = false;
			Boolean capital = false;
			Boolean regular = false;
			if (password.length() == 0)
				return "Password field is empty";
			for (char symbol:password.toCharArray()) {
				if (Character.isDigit(symbol))
					digit = true;
				if (Character.isUpperCase(symbol))
					capital = true;
				if (Character.isLowerCase(symbol))
					regular = true;
			}
			if (!(digit && capital && regular))
				return "Your password doesn't contain at least one ordinal, one capital letter and one digit or shorter than 8 characters";
			return "";
		}
		
		private static String checkName(String name) {
			if (name.length() == 0)
				return "Name field is empty";
			if (name.length() > 30)
				return "Name is too long. The limit is 30 symbols";
			for (char symbol:name.toCharArray())
				if (!Character.isAlphabetic(symbol))
					return "Name is incorrect";
			return "";
		}
		
		private static String checkPhone(String phone) {
			if (phone.length() == 0)
				return "Phone field is empty";
			if (phone.length() > 15)
				return "Phone number is too long. The limit is 15 symbols";
			for (char symbol:phone.toCharArray())
				if (!(Character.isDigit(symbol) || symbol == ' '))
					return "Phone number is incorrect";
			return "";
	}
	
	private static String checkGender(String gender) {
		if (!gender.equals("male") && !gender.equals("female"))
			return "List values violation";
		return "";
	}
}
