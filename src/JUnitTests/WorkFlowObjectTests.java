package JUnitTests;
import project.WorkFlowObject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * This class is used to test all the methods in the WorkFlowObject class.
 * @author Wills Jarquin
 * 
 */
class WorkFlowObjectTests {
	
	/**
	 * TEST 1: constructor test. This test ensures that initiated a variable of the WorkFlowObject class generates an object of its kind.
	 */
	@Test
	void testConstructor() {
		//generate new Workflow Object
		WorkFlowObject wfObj = new WorkFlowObject();
		System.out.println(wfObj.getClass());
		System.out.println(WorkFlowObject.class);
		assertEquals(wfObj.getClass(), WorkFlowObject.class);
	}
	
	/**
	 * TEST 2: constructor with parameter test. This test ensures that initiated a variable of the WorkFlowObject class generates an object of its kind.
	 */
	@Test
	void testConstructorWithParameter() {
		//Default ID.
		String id = "1234";
		
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject(id);
		
		//Check if the id was assigned to the predetermined.
		assertEquals(id, wfObj.getId());
	}
	
	/**
	 * TEST 3: setId() test. This test ensures setting ID will actually change the ID with no error.
	 */
	@Test
	void testSetId() {
		//Default ID.
		String id = "1234";
		String idVariation = "1235";
		
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject(id);
		
		//Reset ID to variation.
		wfObj.setId(idVariation);
		
		//Check if the id was assigned to the variation.
		assertEquals(idVariation, wfObj.getId());
	}
	
	/**
	 * TEST 3: getId() test. This test ensures getting the ID gets the correct ID.
	 */
	@Test
	void testGetId() {
		//Default ID
		String id = "1234";
		
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject();
		
		//Reset ID to variation.
		wfObj.setId(id);
		
		//Check if the get method matches what was assigned.
		assertEquals(id, wfObj.getId());
	}

}
