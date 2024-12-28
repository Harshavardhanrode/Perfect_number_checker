package c31;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class harsh
 */
@WebServlet("/harsh")
public class harsh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public harsh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		//request.getRequestDispatcher("index.html").include(request, response);
		
	 	int number = Integer.parseInt(request.getParameter("number1"));
        boolean result = check_Perfect_Number(number);
        PrintWriter out = response.getWriter();
        
       
        if (result){
         
	        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	        rd.include(request, response); 
	        out.println("<script>");
            out.println("document.getElementById('output').textContent = '" +"Result : "+ result + "';");
            out.println("</script>");
	           
        }else 
        {
	        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	        rd.include(request, response);
	        out.println("<script>");
            out.println("document.getElementById('output').textContent = '" +"Result : "+ result + "';");
            out.println("</script>");
        }
        
    }

    private boolean check_Perfect_Number(int n) {
        if (n <2) 
        	return false;
        int sum = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
		
	}

	

}
