package us.klette.boilerplate.modules;

import org.eclipse.jetty.servlet.DefaultServlet;
import com.google.inject.servlet.ServletModule;

import us.klette.boilerplate.servlets.IndexServlet;

public class DispatcherModule extends ServletModule {

	@Override
	protected void configureServlets() {
		bind(IndexServlet.class).asEagerSingleton();
		bind(DefaultServlet.class).asEagerSingleton();
		
		serve("/").with(IndexServlet.class);
		serve("/static/*").with(DefaultServlet.class);

	}

}
