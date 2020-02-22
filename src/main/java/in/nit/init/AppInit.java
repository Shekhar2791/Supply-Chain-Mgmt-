package in.nit.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import in.nit.config.AppConfig;

	public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

		//Provide Spring Config File as input to web.xml(FC)
		protected Class<?>[] getRootConfigClasses() {
			return new Class[] {AppConfig.class};
		}

		protected Class<?>[] getServletConfigClasses() {
			return null;
		}

		protected String[] getServletMappings() {
			return new String[] {"/"};
		}

}
