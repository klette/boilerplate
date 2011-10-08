package us.klette.boilerplate.modules;

import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class TemplatingModule extends AbstractModule {

	@Override
	protected void configure() {
	}
	
	@Provides @Singleton
	VelocityEngine provideVelocityEngine(){
		
		Properties properties = new Properties();
		properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		properties.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		properties.setProperty(RuntimeConstants.OUTPUT_ENCODING, "UTF-8");
		properties.setProperty(RuntimeConstants.INPUT_ENCODING, "UTF-8");

		VelocityEngine velocityEngine = new VelocityEngine(properties);
		
		return velocityEngine;
	}

}
