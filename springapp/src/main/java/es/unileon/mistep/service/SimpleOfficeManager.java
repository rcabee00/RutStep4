package es.unileon.mistep.service;

import es.unileon.mistep.domain.Office;

/**
 * Class that managers the office's operations
 * 
 * @author rut
 * 
 */
public class SimpleOfficeManager implements OfficeManager {

	private static final long serialVersionUID = 1L;
	/**
	 * The office
	 */
	private Office office;

	/**
	 * Modifies the employee cost of a office
	 * 
	 * @param amount
	 *            the amount
	 */
	public void employeeCostModify(double amount) {
		if (office != null) {
			office.setEmployeeCost(amount);
			
		}
	}

	/**
	 * Method that sets the office
	 * 
	 * @param office
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * Method that returns the office
	 */
	public Office getOffice() {
		return office;
	}

}
