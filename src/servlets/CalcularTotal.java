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
import entidades.Pessoa;

@WebServlet("/CalcularTotal")
public class CalcularTotal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	

		

		try{

			double soma =PessoaDAO.getInstance().somar();
			PrintWriter pw = response.getWriter(); 
			pw.println("<HTML>");  
			pw.println("<TITLE>C</TITLE>");  
			pw.println("<BODY>");  
			pw.println(soma);  
			pw.println("</BODY>");  
			pw.println("</HTML>");  
			pw.flush();

		}catch (SQLException e){

			e.printStackTrace();

		}


	}

}
