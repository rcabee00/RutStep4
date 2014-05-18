package es.unileon.schoolSpring.springapp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import es.unileon.schoolSpring.springapp.domain.Office;

public class SimpleOfficeManagerTest {

	private SimpleOfficeManager officeManager;

	private Office office;

	
	private static Double EMPLOYEE_COST = new Double(127.34);
	private static Double LOCAL_COST = new Double(200.00);
	private static Double UTILITIES_COST = new Double(400.39);
	private static Double EXPENSES_COST = new Double(727.73);
	private static Double MODIFY_COST = new Double(400.00);
	private static String OFFICE_DESCRIPTION = "0 - LEON-ORDOGNO II";

	@Before
	public void setUp() throws Exception {
		officeManager = new SimpleOfficeManager();		
		office = new Office();
		office.setDescription(OFFICE_DESCRIPTION);
		office.setEmployeeCost(EMPLOYEE_COST);
		office.setLocalCost(LOCAL_COST);
		office.setUtilitiesCost(UTILITIES_COST);
		office.setTotalExpenses();
		officeManager.setOffice(office);
	}

	@Test
	public void testGetEmptyOffice() {
		officeManager = new SimpleOfficeManager();
		assertNull(officeManager.getOffice());
	}

	@Test
	public void testGetOffice() {
		Office office = officeManager.getOffice();
		assertNotNull(office);		
		assertEquals(OFFICE_DESCRIPTION, office.getDescription());
		assertEquals(EMPLOYEE_COST, office.getEmployeeCost(), 0);
		assertEquals(LOCAL_COST, office.getLocalCost(), 0);
		assertEquals(UTILITIES_COST, office.getUtilitiesCost(), 0);
		office.setTotalExpenses();
		assertEquals(EXPENSES_COST, office.getTotalExpenses(), 0);

	}

	@Test
	public void testModifyCostWithNullOffice() {
		try {
			officeManager = new SimpleOfficeManager();
			officeManager.employeeCostModify(200.00);
			;
		} catch (NullPointerException ex) {
			fail("Office  is null.");
		}
	}

	@Test
	public void testModifyCostWithEmptyListOfOffices() {
		try {
			officeManager = new SimpleOfficeManager();
			officeManager.setOffice(new Office());
			officeManager.employeeCostModify(MODIFY_COST);
			
		} catch (Exception ex) {
			fail("Office is empty.");
		}
	}

	@Test
	public void testModifyCost() {
		Office office = officeManager.getOffice();
		assertNotEquals(MODIFY_COST, office.getEmployeeCost(), 0);
		officeManager.employeeCostModify(MODIFY_COST);
		assertEquals(MODIFY_COST, office.getEmployeeCost(), 0);

	}

}
