package es.unileon.mistep.service;

import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Class that represents a modification in the employee costs
 * @author rut
 *
 */
public class EmployeeCostModify {
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Min(0)    
    private double amount;
    private double previous;

    public void setAmount(double i) {
    	amount = i;
        logger.info(" Employee Cost set to " + i);
    }

    public double getAmount() {
        return amount;
    }

	public double getPrevious() {
		return previous;
	}

	public void setPrevious(double previous) {
		this.previous = previous;
	}
}
