package com.myservlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myservice.WelcomeService;

/**
 * Servlet implementation class WelcomeServlet
 * Here this class is the we move the business logic to a Service class
 * from where the business logic is read based on the request.
 * The response msg is then displayed 
 * in the JSP page using JSTL(Java Server pages standard tag Library).
 */
@WebServlet("/WelcomeServlet2")
public class WelcomeServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Create Data model and add it to the request attribute
		WelcomeService welcomeService = new WelcomeService();
		List<String> msgs = welcomeService.getMessages("Ganesh");
		request.setAttribute("Welcome", msgs);
		
		//2.Retrieve the request dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome2.jsp");
		
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
