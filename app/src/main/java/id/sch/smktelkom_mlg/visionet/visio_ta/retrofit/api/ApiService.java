package id.sch.smktelkom_mlg.visionet.visio_ta.retrofit.api;

import id.sch.smktelkom_mlg.visionet.visio_ta.model.ContactList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

	/*
	Retrofit get annotation with our URL
	And our method that will return us the List of ContactList
	*/
	@GET("/bins/x3vr")
	Call<ContactList> getMyJSON();
}
