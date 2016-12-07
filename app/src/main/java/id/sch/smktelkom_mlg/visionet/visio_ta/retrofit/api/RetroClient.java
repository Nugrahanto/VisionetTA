package id.sch.smktelkom_mlg.visionet.visio_ta.retrofit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetroClient {

	/********
	 * URLS
	 *******/
	private static final String ROOT_URL = "https://api.myjson.com";

	/**
	 * Get Retrofit Instance
	 */
	private static Retrofit getRetrofitInstance() {
		return new Retrofit.Builder()
				.baseUrl(ROOT_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build();
	}

	/**
	 * Get API Service
	 *
	 * @return API Service
	 */
	public static ApiService getApiService() {
		return getRetrofitInstance().create(ApiService.class);
	}
}
