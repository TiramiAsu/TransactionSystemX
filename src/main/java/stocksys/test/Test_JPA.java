/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package stocksys.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import stocksys.test.entity.Classify;
import stocksys.test.service.PortfolioService;

/**
 * <pre>
 * [Test] 2020-03-31 18:26
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class Test_JPA {

	static PortfolioService service;
	static AnnotationConfigApplicationContext appContext;
	static {
		appContext = new AnnotationConfigApplicationContext();
		appContext.scan("stocksys.test");
		appContext.refresh();
		service = (PortfolioService) appContext.getBean("portfolioService");
	}

	public static void main(String[] args) {
		service.getClassifyDAO().save(new Classify("股票", Boolean.TRUE));
		service.getClassifyDAO().save(new Classify("匯率", Boolean.TRUE));
		service.getClassifyDAO().save(new Classify("指數", Boolean.FALSE));
	}
}
