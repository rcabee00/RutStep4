package es.unileon.schoolSpring.springapp.web;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.schoolSpring.springapp.service.SimpleOfficeManager;

public class OfficeCostControllerTests {

	@Test
	public void testHandleRequestView() throws Exception{
		OfficeCostController controller = new OfficeCostController();
        controller.setOfficeManager(new SimpleOfficeManager());
        
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        //assertEquals("hello.jsp", modelAndView.getViewName());
        
        //assertEquals("WEB-INF/views/hello.jsp", modelAndView.getViewName());
        
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
       // String nowValue = (String) modelAndView.getModel().get("now");
        
    }
	

	

}
