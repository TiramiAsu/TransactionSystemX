/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package stocksys.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stocksys.test.dao.ClassifyDAO;

/**
 * <pre>
 * [PortfolioService] 2020-03-27 19:48
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
@Service(value = "portfolioService")
public class PortfolioService {

	@Autowired
	private ClassifyDAO classifyDAO;

	public ClassifyDAO getClassifyDAO() {
		return classifyDAO;
	}
}
