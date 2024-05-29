package read_form_data;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeInfo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("emp_name");
		String sal=req.getParameter("emp_sal");
		String des=req.getParameter("emp_des");
		String id=req.getParameter("emp_id");
		
		System.out.println(name);
		System.out.println(sal);
		System.out.println(des);
		System.out.println(id);
	}

}
