package es.unileon.mistep.repository;

import static org.junit.Assert.assertEquals;

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
	    public void testGetOffice() {
	        Office office = officeDao.getOffice();
	       
	    }

	    @Test
	    public void testSaveProduct() {        

	        Office off = officeDao.getOffice();
	        
	        Double localCost = off.getLocalCost();
	        off.setLocalCost(400.75);	        
	        Double utilitiesCost = off.getUtilitiesCost();
	        off.setUtilitiesCost(1400.75);
	        Double employeeCost = off.getEmployeeCost();
	        off.setEmployeeCost(4400.75);
	        
	        officeDao.saveOffice(off);
	        
	        Office off2 = officeDao.getOffice();
	        
	        
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
