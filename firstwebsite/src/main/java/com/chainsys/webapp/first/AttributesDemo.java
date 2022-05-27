package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributesDemo
 */
public class AttributesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttributesDemo() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
    public String salary=null;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//System.out.println("Dopost called");
		//PrintWriter out=response.getWriter();
		//response.setContentType("text/html");
		//out.println("<html><head><title>HelloWorld</title></head></body>");
		//out.println("<h1>post called</h1>");
		//out.println("</body></html>");
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><title>HelloWorld</title></head><body>");
        String submitValue = request.getParameter("submit");
        if (submitValue.equals("set")) 
        {
            String salaryInput = request.getParameter("salary");
            salary = salaryInput;//Storing data in global variable
            out.println("<hl>Value Set</hl>" + salary);
        } else if (submitValue.equals("fetch"))
        {
            out.println("<hl>Value fetch</hl>" + salary);//returning value from global variable to html
        }
        
        out.println("</body></html>");
	}

}
