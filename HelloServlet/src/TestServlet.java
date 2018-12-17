

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    public TestServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		request.setCharacterEncoding("UTH-8");
		response.setContentType("text/html; charset=UTF-8");


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		doGet(request, response);
	}

}
