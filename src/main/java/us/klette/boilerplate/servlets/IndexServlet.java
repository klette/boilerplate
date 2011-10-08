package us.klette.boilerplate.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;


@SuppressWarnings("serial")
public class IndexServlet extends BaseServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		Template template = velocityEngine.getTemplate("templates/index.vm", "UTF-8");
		template.merge(new VelocityContext(), response.getWriter());

	}
	
}
