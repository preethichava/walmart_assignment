package assignment;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("unused")

public class JsonParser {

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public static String callURL(String myURL) {
		// System.out.println("Requested URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
			in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:" + myURL, e);
		}

		return sb.toString();
	}

	public static float getReview(String id) throws IOException {
		// Review section
		float avg = 0;

		try {

			String url = "http://api.walmartlabs.com/v1/reviews/" + id + "?apiKey=eahh6ej8jmz8q3dzx5m572z3&format=json";

			JSONObject robject = readJsonFromUrl(url);

			JSONArray arr2 = robject.getJSONArray("reviews");
			JSONObject rrat = (JSONObject) robject.get("reviewStatistics");

			String rs = rrat.getString("averageOverallRating");
			avg = Float.parseFloat(rs);

			System.out.println("average overall rating - " + avg);
			for (int i = 0; i < arr2.length(); i++) {

				JSONObject rr = (JSONObject) arr2.get(i);
				String rev = rr.getString("reviewText");
				System.out.println("review --- " + (i + 1));
				System.out.println(rev);

			}

		} catch (JSONException e) {
			return 0;
		}
		return avg;

	}

	public static long getpidSearch(String url) throws IOException {
		// getting item id of the 1st product obtained in search
		long id;
		String pidname1;
		JSONObject json = readJsonFromUrl(url);
		JSONArray arr = json.getJSONArray("items");
		System.out.println(" The first product appeared in the search is ");
		JSONObject site = (JSONObject) arr.get(0);
		id = site.getLong("itemId");
		pidname1 = site.getString("name");

		System.out.println("   " + pidname1 + " -- " + id);
		System.out.println();
		return id;
	}
	// Get the product ID of the recommendation

	public static ArrayList<Product> getpidPR(String uri)

	{
		long pid[] = new long[10];
		String jsonString = callURL(uri);
		String pidname[] = new String[10];
		ArrayList<Product> productList = new ArrayList<Product>();
		Product product = null;
		try {
			JSONArray arr1 = new JSONArray(jsonString);

			for (int i = 0; i < 10; i++) {
				JSONObject probject = (JSONObject) arr1.get(i);
				product = new Product();
				product.setId(String.valueOf(probject.getLong("itemId")));
				product.setName(probject.getString("name"));
				productList.add(product);

			}

		} catch (JSONException je) {

		}
		return productList;

	}

	// method to rank order the product ids according to the avg rating

	public static ArrayList<Product> rankOrder(ArrayList<Product> recommendedProductList) {

		Collections.sort(recommendedProductList, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return p2.compareTo(p1);
			}
		});
		return recommendedProductList;

	}

	public static void main(String[] args) throws IOException {
		String pidname[] = new String[10];
		Product product = new Product();

		long pid[] = new long[10];
		long id = 0;
		float avgrat[] = new float[10];
		String search = args[0];
		String url = "http://api.walmartlabs.com/v1/search?apiKey=eahh6ej8jmz8q3dzx5m572z3&query=" + search;

		// getting product id of the first item in search
		id = getpidSearch(url);

		String cid = Long.toString(id);
		String uri = "http://api.walmartlabs.com/v1/nbp?apiKey=eahh6ej8jmz8q3dzx5m572z3&itemId=" + cid;

		// getting product recommnedation ids and names
		ArrayList<Product> recommendedProductList = getpidPR(uri);
		
		System.out.println("product recommendations and their reviews : "+ "\n\n");

		for (Product prod : recommendedProductList) {
			System.out.println("\n\n\n");
			System.out.println(prod.toString());
			
			
			prod.setRating(getReview(prod.getId()));
			
		}
		

		recommendedProductList = rankOrder(recommendedProductList);

		for (Product prod : recommendedProductList) {
			System.out.println(prod.toString());
		}

	}

}
