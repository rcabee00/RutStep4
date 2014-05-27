package es.unileon.mistep.service;

import java.io.Serializable;
import java.util.List;

import es.unileon.mistep.domain.Office;
/**
 * 
 * @author rut
 *
 */
public interface OfficeManager extends Serializable {

	public void employeeCostModify(double amount);

	public Office getOffice();
}
