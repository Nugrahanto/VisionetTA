package id.sch.smktelkom_mlg.visionet.visio_ta.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by asus on 07/12/2016.
 */

public class ContactList {
	@SerializedName("status")
	@Expose
	private String status;

	@SerializedName("source")
	@Expose
	private String source;

	@SerializedName("sortBy")
	@Expose
	private String sortBy;

	@SerializedName("articles")
	@Expose
	private ArrayList<Contact> contact = new ArrayList<>();

	public ArrayList<Contact> getContact() {
		return contact;
	}

	public void setContact(ArrayList<Contact> Contact) {
		this.contact = Contact;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
