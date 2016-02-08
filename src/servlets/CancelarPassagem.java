package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PessoaDAO;

@WebServlet("/CancelarPassagem")
public class CancelarPassagem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		try{
			
			String nome = request.getParameter("nome");

			PessoaDAO.getInstance().delete(nome);

			RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
			rq.forward(request, response);
			
		}catch (SQLException e){

			e.printStackTrace();

		}

	}

}
