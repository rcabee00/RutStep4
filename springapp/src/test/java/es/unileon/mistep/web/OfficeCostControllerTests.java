package es.unileon.mistep.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.mistep.service.SimpleOfficeManager;
import es.unileon.mistep.domain.Office;
import es.unileon.mistep.repository.InMemoryOfficeDao;

public class OfficeCostControllerTests {
	@Test
	public void testHandleRequestView() throws Exception {

		OfficeCostController controller = new OfficeCostController();

		SimpleOfficeManager spm = new SimpleOfficeManager();
		spm.setOfficeDao(new InMemoryOfficeDao(new Office()));

		controller.setOfficeManager(spm);
		// controller.setOfficeManager(new SimpleOfficeManager());

		ModelAndView modelAndView = controller.handleRequest(null, null);

		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());

	}

}
