package campus_threads.backend.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Post {
	private String postTitle_;
	private String imageUrl_;
	private double itemPrice_;
	private String description_;
	private String seller_;
	private Boolean sold_;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int postID_;

	public Post(String postTitle, String imageUrl, double itemPrice, String description, String seller, Boolean sold,
			int postID) {
		this.postTitle_ = postTitle;
		this.imageUrl_ = imageUrl;
		this.itemPrice_ = itemPrice;
		this.description_ = description;
		this.seller_ = seller;
		this.sold_ = sold;
	}

	// Getters
	public String getPostTitle() {
		return postTitle_;
	}

	public String getImageUrl() {
		return imageUrl_;
	}

	public double getItemPrice() {
		return itemPrice_;
	}

	public String getDescription() {
		return description_;
	}

	public String getSeller() {
		return seller_;
	}

	public Boolean isSold() {
		return sold_;
	}

	public int getPostID() {
		return postID_;
	}

	// Setters
	public void setPostTitle(String postTitle) {
		this.postTitle_ = postTitle;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl_ = imageUrl;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice_ = itemPrice;
	}

	public void setDescription(String description) {
		this.description_ = description;
	}

	public void setSeller(String seller) {
		this.seller_ = seller;
	}

	public void setSold(Boolean sold) {
		this.sold_ = sold;
	}

	public void setPostID(int postID) {
		this.postID_ = postID;
	}

}
