package es.unileon.mistep.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.mistep.service.SimpleOfficeManager;

public class OfficeCostControllerTests {
	@Test
    public void testHandleRequestView() throws Exception{		
        OfficeCostController controller = new OfficeCostController();
        controller.setOfficeManager(new SimpleOfficeManager());
        
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        
        
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
       
    }


}
