package es.unileon.mistep.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.mistep.domain.Office;
public class JPAOfficeDaoTests {

	  private ApplicationContext context;
	    private OfficeDao officeDao;

	    @Before
	    public void setUp() throws Exception {
	        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	        officeDao = (OfficeDao) context.getBean("officeDao");
	    }

	    @Test
	    public void testGetProductList() {
	        List<Office> products = officeDao.getOfficeList();
	        assertEquals(products.size(), 3, 0);	   
	    }

	    @Test
	    public void testSaveProduct() {
	        List<Office> offices = officeDao.getOfficeList();

	        Office off = offices.get(0);
	        
	        Double localCost = off.getLocalCost();
	        off.setLocalCost(400.75);	        
	        Double utilitiesCost = off.getUtilitiesCost();
	        off.setUtilitiesCost(1400.75);
	        Double employeeCost = off.getEmployeeCost();
	        off.setEmployeeCost(4400.75);
	        
	        officeDao.saveOffice(off);
	        
	        List<Office> updatedOffices = officeDao.getOfficeList();
	        Office off2 = updatedOffices.get(0);
	        
	        assertEquals(off2.getLocalCost(),400.75,0);
	        assertEquals(off2.getUtilitiesCost(),1400.75,0);
	        assertEquals(off2.getEmployeeCost(),4400.75,0);
	        
	        off2.setLocalCost(localCost);
	        off2.setUtilitiesCost(utilitiesCost);
	        off2.setEmployeeCost(employeeCost);
	        officeDao.saveOffice(off2);
	        
	        
	        officeDao.saveOffice(off2);
	        
	        
	        
	    }

}
