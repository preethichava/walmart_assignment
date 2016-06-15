package assignment;

import static org.junit.Assert.*;

import java.io.IOException;

public class Test {

	@org.junit.Test
	public void getpidSearch() throws IOException {

		JsonParser test = new JsonParser();
		
		
		assertEquals (12173437,test.getpidSearch("http://api.walmartlabs.com/v1/search?apiKey=eahh6ej8jmz8q3dzx5m572z3&query="+""));
	}

}



/////////////////////
/*@Test
public void testAdd() {
   //test data
   int num= 5;
   String temp= null;
   String str= "Junit is working fine";

   //check for equality
   assertEquals("Junit is working fine", str);
   
   //check for false condition
   assertFalse(num > 6);

   //check for not null value
   assertNotNull(str);
*/