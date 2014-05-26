package es.unileon.mistep.repository;

import java.util.List;

import es.unileon.mistep.domain.Office;

public interface OfficeDao {
	 public List<Office> getOfficeList();

	 public void saveOffice(Office off);
}
