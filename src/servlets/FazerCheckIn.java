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

@WebServlet("/FazerCheckIn")
public class FazerCheckIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = null;
		
		Pessoa pessoa = new Pessoa();
		
		try{
			
			nome = request.getParameter("nome");
			
			PessoaDAO.getInstance().getById(nome);
			
			PrintWriter pw = response.getWriter(); 
			pw.println("<HTML>");  
		      pw.println("<TITLE>Total apurado</TITLE>");  
		      pw.println("<BODY>");  
		      pw.println(pessoa.getNome());  
		      pw.println(pessoa.getTipoPassagem());
		      pw.println(pessoa.getEndereco());
		      pw.println(pessoa.getPrecoPassagem());
		      pw.println("</BODY>");  
		      pw.println("</HTML>");  
		      pw.flush();
		      
					
		}catch (SQLException e){

			e.printStackTrace();

		}
		
	}

}
