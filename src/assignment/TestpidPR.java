package assignment;

import static org.junit.Assert.*;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;


public class TestpidPR {


	@org.junit.Test
	public void rankOrder() throws IOException {

		JsonParser test = new JsonParser();
		Product p = new Product();
		ArrayList<Product> productList = new ArrayList<Product>();
		for(int i=0; i<10;i++){
			p.setId(String.valueOf(i+1));
			p.setName("product"+i);
			p.setRating(i*2);
			productList.add(p);
		}
		productList = test.rankOrder(productList);
		
    //assertEquals(expected,actual);
		assertEquals("10", productList.get(9).getId());
	}

}
