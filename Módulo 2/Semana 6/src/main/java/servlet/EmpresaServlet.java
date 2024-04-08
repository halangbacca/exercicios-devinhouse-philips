package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Empresa;
import repository.EmpresaRepository;

@WebServlet("/EmpresaServlet")
public class EmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpresaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Empresa> empresas = EmpresaRepository.getEmpresas();
		
		EmpresaRepository.addEmpresa(new Empresa("Umbrella Corporation", "08.317.253/0001-03"));
		EmpresaRepository.addEmpresa(new Empresa("Tricell Inc.", "65.692.170/0001-20"));
		EmpresaRepository.addEmpresa(new Empresa("WilPharma Corporation", "38.640.430/0001-40"));

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Empresas</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");

		for (Empresa empresa : empresas) {
			out.println("<li>" + "Nome: " + empresa.getNome() + " - CPNJ: " + empresa.getCnpj() + "</li>");
		}

		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		
		Empresa empresa = new Empresa(nome, cnpj);
		
		EmpresaRepository.addEmpresa(empresa);
		
		EmpresaRepository.getEmpresas().forEach(e -> System.out.println(e.getNome()));
		
		doGet(request, response);
	}

}
