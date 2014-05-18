package es.unileon.mistep.service;
import java.io.Serializable;

import es.unileon.mistep.domain.Office;
public interface OfficeManager extends Serializable {

    public void employeeCostModify(double amount);
    
    public Office getOffice();
}

