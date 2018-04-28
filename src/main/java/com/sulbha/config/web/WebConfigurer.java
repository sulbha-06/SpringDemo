/*Date:28.04.2018
 * purpose: To configure Spring  front Controller 
 * 
 * 
 */
package com.sulbha.config.web;

import static com.sulbha.utility.contants.AppConstants.CONFIG_LOCATION; //importing config location from appContants interface

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.ServletContextAwareProcessor;
import org.springframework.web.servlet.DispatcherServlet;


@Configuration
public class WebConfigurer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		
		appContext.setConfigLocation(CONFIG_LOCATION);
		
		servletContext.addListener(new ContextLoaderListener(appContext));
		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatccherServlet",new DispatcherServlet(appContext));
		dispatcherServlet.setLoadOnStartup(1);
		dispatcherServlet.addMapping("/*");
		
	}

}
