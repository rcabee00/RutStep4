package es.unileon.mistep.repository;

import es.unileon.mistep.domain.Office;

public class InMemoryOfficeDao implements OfficeDao {
	private Office office;

	public InMemoryOfficeDao(Office office) {
		this.office = office;
	}

	public Office getOffice() {
		return office;
	}

	public void saveOffice(Office off) {

	}
}
