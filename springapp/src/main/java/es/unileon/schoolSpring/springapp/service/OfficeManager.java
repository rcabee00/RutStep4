package es.unileon.schoolSpring.springapp.service;
import java.io.Serializable;
import es.unileon.schoolSpring.springapp.domain.Office;
public interface OfficeManager extends Serializable {

    public void employeeCostModify(double amount);
    
    public Office getOffice();
}

