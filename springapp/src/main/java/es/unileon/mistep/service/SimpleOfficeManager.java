package es.unileon.mistep.service;

import es.unileon.mistep.domain.Office;



public class SimpleOfficeManager implements OfficeManager{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Office office;

	public void employeeCostModify(double amount) {
		if (office != null) {
            
               office.setEmployeeCost(amount);
               office.getTotalExpenses();
            
        }   
	}

	public void setOffice(Office office) {
		 this.office= office;
	}

	public Office getOffice() {
		
		return office;
	}

}
