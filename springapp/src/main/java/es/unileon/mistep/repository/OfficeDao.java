package es.unileon.mistep.repository;

import es.unileon.mistep.domain.Office;

public interface OfficeDao {
	 public Office getOffice();

	 public void saveOffice(Office off);
}
