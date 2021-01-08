package nihao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x = req.getParameter("aaa");     // 如果请求的参数中，没有 aaa，那么 x 的值就是 null
		System.out.println("x: " + (x == null ? 0 : x.length())); // 如果上面得到的是 null, 则 x.length() 就会报 NullPointerException 错

		PrintWriter writer = resp.getWriter();
		writer.write("<html><h3>Hello Java Web</h3></html>");
	}
	public void sss () {}
}
