package es.unileon.mistep.service;

import es.unileon.mistep.domain.Office;

/**
 * 
 * @author rut
 * 
 */
public class SimpleOfficeManager implements OfficeManager {

	private static final long serialVersionUID = 1L;
	private Office office;

	public void employeeCostModify(double amount) {
		if (office != null) {
			office.setEmployeeCost(amount);
			office.getTotalExpenses();
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
