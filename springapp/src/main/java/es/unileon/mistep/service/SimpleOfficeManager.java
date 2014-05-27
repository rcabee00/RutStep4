package es.unileon.mistep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.unileon.mistep.domain.Office;
import es.unileon.mistep.repository.OfficeDao;

/**
 * Class that managers the office's operations
 * 
 * @author rut
 * 
 */
@Component
public class SimpleOfficeManager implements OfficeManager {

	private static final long serialVersionUID = 1L;

	@Autowired
	private OfficeDao officeDao;

	public void setOfficeDao(OfficeDao officeDao) {
		this.officeDao = officeDao;
	}

	/**
	 * Modifies the employee cost of a office
	 * 
	 * @param amount
	 *            the amount
	 */
	public void employeeCostModify(double amount) {

		Office office = officeDao.getOffice();
		if (office != null) {
			office.setEmployeeCost(amount);
			officeDao.saveOffice(office);

		}

	}

	/**
	 * Method that returns the office
	 */
	public Office getOffice() {
		return officeDao.getOffice();
	}

}
