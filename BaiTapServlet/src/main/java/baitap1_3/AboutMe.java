package baitap1_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AboutMe
 */
@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter traVe = response.getWriter();
		traVe.append("Bạn đã gửi yêu cầu Get!");
		String noiDungHTML = "<div class=\"container\">\r\n"
				+ "        <h1>Thông tin cá nhân</h1>\r\n"
				+ "        <ul>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Họ và tên:</label> John Doe\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Ngày sinh:</label> 01/01/1990\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Địa chỉ:</label> 123 Nguyễn Du, Quận 1, TP. HCM\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Email:</label> johndoe@example.com\r\n"
				+ "            </li>\r\n"
				+ "            <li>\r\n"
				+ "                <label>Số điện thoại:</label> +84 123 456 789\r\n"
				+ "            </li>\r\n"
				+ "        </ul>\r\n"
				+ "    </div>";
		traVe.append(noiDungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
