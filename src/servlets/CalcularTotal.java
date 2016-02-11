package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PessoaDAO;

@WebServlet("/CalcularTotal")
public class CalcularTotal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	

		

		try{

			PrintWriter pw = response.getWriter(); 
			pw.println("<HTML>");  
			pw.println("<TITLE>Calcular Total</TITLE>");  
			pw.println("<BODY>");  
			pw.println("<h1>O total apurado de passsagens até o momento é de:</h1>");
			pw.println("<h1>");
			pw.println(PessoaDAO.getInstance().somar());  
			pw.println("</h1><br><br>");
			pw.println("</BODY>");  
			pw.println("</HTML>");
			
			pw.flush();

		}catch (SQLException e){

			e.printStackTrace();

		}


	}

}
