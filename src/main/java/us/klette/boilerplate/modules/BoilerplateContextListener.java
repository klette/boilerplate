package us.klette.boilerplate.modules;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class BoilerplateContextListener extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(
				new TemplatingModule(),
				new DispatcherModule()
		);
	}
	

}
