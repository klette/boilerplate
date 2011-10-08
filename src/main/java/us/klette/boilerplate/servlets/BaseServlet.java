package us.klette.boilerplate.servlets;

import javax.servlet.http.HttpServlet;

import org.apache.velocity.app.VelocityEngine;

import com.google.inject.Inject;

@SuppressWarnings("serial")
public class BaseServlet extends HttpServlet {
	protected VelocityEngine velocityEngine;
	
	@Inject
	public void setVelocityEngine(VelocityEngine ve){
		velocityEngine = ve;
	}
}
