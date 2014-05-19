package es.unileon.mistep.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unileon.mistep.domain.Office;

public class OfficeTests {

	private Office office;
	double testEmployeeCost, testLocalCost, testUtilitiesCost;

	@Before
	public void setUp() throws Exception {
		testEmployeeCost = 250.00;
		testLocalCost = 100.00;
		testUtilitiesCost = 100.70;

		office = new Office();
	}

	@Test
	public void testSetAndGetDescription() {
		String testDescription = "aDescription";
		assertNull(office.getDescription());
		office.setDescription(testDescription);
		assertEquals(testDescription, office.getDescription());
	}

	@Test
	public void testSetAndGetLocalCost() {

		assertEquals(0, 0, 0);
		office.setLocalCost(testLocalCost);
		assertEquals(testLocalCost, office.getLocalCost(), 0);
	}

	@Test
	public void testSetAndGetUtilitiesCost() {

		assertEquals(0, 0, 0);
		office.setUtilitiesCost(testUtilitiesCost);
		assertEquals(testUtilitiesCost, office.getUtilitiesCost(), 0);
	}

	@Test
	public void testSetAndGetEmployeeCost() {

		assertEquals(0, 0, 0);
		office.setEmployeeCost(testEmployeeCost);
		assertEquals(testEmployeeCost, office.getEmployeeCost(), 0);
	}

	@Test
	public void testGetExpenses() {
		double testExpenses = 450.70;
		assertEquals(0, 0, 0);
		office.setEmployeeCost(testEmployeeCost);
		office.setLocalCost(testLocalCost);
		office.setUtilitiesCost(testUtilitiesCost);		
		assertEquals(testExpenses, office.getTotalExpenses(), 0);
	}

}
