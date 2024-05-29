package read_form_data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserInfo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String user = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String age = req.getParameter("user_age");

		System.out.println("user name is " + user);
		System.out.println("email is " + email);
		System.out.println("ageis " + age);
	}

}
