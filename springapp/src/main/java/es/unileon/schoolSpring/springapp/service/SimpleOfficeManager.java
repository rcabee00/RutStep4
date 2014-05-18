package es.unileon.schoolSpring.springapp.service;

import es.unileon.schoolSpring.springapp.domain.Office;



public class SimpleOfficeManager implements OfficeManager{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Office office;

	public void employeeCostModify(double amount) {
		if (office != null) {
            
               office.setEmployeeCost(amount);
               office.setTotalExpenses();
            
        }   
	}

	public void setOffice(Office office) {
		 this.office= office;
	}

	public Office getOffice() {
		
		return office;
	}

}
