package finalCheckOne;


import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.URI;

//import retrofit.JacksonConverterFactory;
import retrofit2.converter.jackson.*;
import retrofit2.*;


/**
 *
 */
public final class RestClient {

    private static IRestService mRestService = null;

    public static IRestService getClient() {
        if(mRestService == null) {
            final OkHttpClient client = new OkHttpClient();
            client.interceptors().add(new FakeInterceptor());

            final Retrofit retrofit = new Retrofit.Builder()
                            // Using custom Jackson Converter to parse JSON
                            // Add dependencies:
                            // com.squareup.retrofit:converter-jackson:2.0.0-beta2
                    .addConverterFactory(JacksonConverterFactory.create())
                            // Endpoint
                    .baseUrl(IRestService.ENDPOINT)
                    .client(client)
                    .build();

            mRestService = retrofit.create(IRestService.class);
        }
        return mRestService;
    }
}





