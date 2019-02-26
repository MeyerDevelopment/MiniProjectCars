package controller;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cars;

/**
 * Servlet implementation class addCarsServlet
 */
@WebServlet("/addCarsServlet")
public class addCarsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addCarsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		String color = request.getParameter("color");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String myear = request.getParameter("myear");
		
		LocalDate ld;
		try {
		ld = LocalDate.of(Integer.parseInt(myear),
		Integer.parseInt(month), Integer.parseInt(day));
		}catch(NumberFormatException ex) {
		ld = LocalDate.now();
		}
		java.util.Date mDate = java.sql.Date.valueOf(ld);
		Cars li = new Cars(make, model, year, color, mDate);
		ListCarsHelper dao = new ListCarsHelper();
		dao.insertCars(li);
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
