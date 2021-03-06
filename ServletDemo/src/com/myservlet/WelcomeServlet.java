package com.myservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 * Here this class is the old way of creating a servlet class 
 * and this servlet class has a call to jsp page which has a business logic 
 * to display the required data.
 * Internally Tomcat server is called from this servlet and this servlet
 * call the jsp page which is again a dynamic servlet called to run the java code
 * and display required message.
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Create Data model and add it to the request attribute
		String[] messages = {"Welcome", "Hello", "Hi"};
		request.setAttribute("Welcome", messages);
		
		//2.Retrieve the request dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
		
		//3. Forward the request to the view
		requestDispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
