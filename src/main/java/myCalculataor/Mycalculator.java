package myCalculataor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Mycalculator
 */
public class Mycalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String[] quotes = {
			"It's not the face that makes someone a monster; it's the choices they make with their lives. - Satoru Gojo",

			"Humans are fragile, Sorcery is intangible, but the emotions of those who wield it are just as real as life itself. - Satoru Gojo",

			"What you call 'cursed energy' is nothing more than distorted and unbalanced emotions. - Sukuna",

			"I'd rather trust and regret than doubt and regret. - Megumi Fushiguro",

			"I'm not gonna run away. I never have and I never will. - Yuji Itadori",

			"No one knows what the future holds. That's why its potential is infinite. - Yuta Okkotsu",

			"Don't talk about effort if you're not putting it in yourself. - Nobara Kugisaki",

			"Being human means having limits. That's what makes things interesting. - Satoru Gojo",

			"You're gonna die surrounded by people who love you! - Yuji Itadori",

			"In order to grow, you need to embrace the pain and hardships. - Satoru Gojo",	
	};
    public Mycalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting/Taking the input from the user
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		// Type casting
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans;

		switch (str3) {
		    case "1":
		        ans = num1 + num2;
		        break;
		    case "2":
		        ans = num1 - num2;
		        break;
		    case "3":
		        ans = num1 * num2;
		        break;
		    default:
		        ans = num1 / num2;
		}
		
		// For generating random quotes
		int randomIndex = (int) (Math.random()*quotes.length);
		String randomquotes = quotes[randomIndex];
		
		//response.getWriter().append("ANS = "+ans); // This is used for only take input from the HTML file not from jsp
		response.sendRedirect("index.jsp?ans="+ans+ "&quotes="+randomquotes ); // This will redirect servlet to the jsp page
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
