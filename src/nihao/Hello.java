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
		String x = req.getParameter("aaa");     // �������Ĳ����У�û�� aaa����ô x ��ֵ���� null
		System.out.println("x: " + (x == null ? 0 : x.length())); // �������õ����� null, �� x.length() �ͻᱨ NullPointerException ��

		PrintWriter writer = resp.getWriter();
		writer.write("<html><h3>Hello Java Web</h3></html>");
	}
	public void sss () {}
}
