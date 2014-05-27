package es.unileon.mistep.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.mistep.domain.Office;



@Repository(value = "officeDao")
public class JPAOfficeDao implements OfficeDao{
	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public Office getOffice() {
    	
    	List<Office> offices = em.createQuery("select off from Office off order by off.id").getResultList();
        return offices.get(2);
        
    	//return (Office) em.createQuery("select * from Office  where id=1").getSingleResult();
    }

    @Transactional(readOnly = false)
    public void saveOffice(Office off) {
        em.merge(off);
    }
}
