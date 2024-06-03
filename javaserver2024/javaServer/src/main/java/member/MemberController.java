package member;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mcontroller")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MemberDao dao;
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		dao = new MemberDao();
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		String view = "";
		if(action == null) {
			getServletContext().getRequestDispatcher("/mcontroller?" 
					+ "action=list").forward(req, resp);
		}else {
			switch (action) {
				case "list": {
					view = list(req, resp);
					break;
				}
				case "insert": {
					view = insert(req, resp);
					break;
				}
			}
			getServletContext().getRequestDispatcher(view).forward(req, resp);
		}
	}
	
	private String list(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("memberlist", dao.getAll());
		return "/memberinfo.jsp";
	}
	private String insert(HttpServletRequest req, HttpServletResponse resp) {
		Member m = new Member();
		m.setUsername(req.getParameter("username"));
		m.setCompany(req.getParameter("company"));
		m.setEmail(req.getParameter("email"));
		dao.insert(m);
		return list(req, resp);
	}
	

}
