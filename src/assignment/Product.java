package assignment;

public class Product implements Comparable<Product> {
	private String id;
	private String name;
	private float rating;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		// return (int) (this.rating-((Product)p).getRating());
		// return (int) ((((Product)p).getRating()-this.rating));
		float rating1 = this.rating;
		float rating2 = p.getRating();
		if (rating2 > rating1)
			return -1;
		if (rating1 < rating2)
			return 1;
		return 0;
	}

	public String toString() {
		return this.id + "----" + this.name + "----" + this.rating;
	}

}
