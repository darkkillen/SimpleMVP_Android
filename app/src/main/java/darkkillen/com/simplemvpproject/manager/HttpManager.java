package darkkillen.com.simplemvpproject.manager;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import darkkillen.com.simplemvpproject.manager.http.ApiService;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class HttpManager {

    private String url = null;

    private static HttpManager instance;
    private ApiService service;
    private static Interceptor myInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            // Logging, active only in debug mode
            long t1 = System.nanoTime();
            Log.d("retrofit", String.format("Sending request %s on %s%n%s",
                    request.url(), chain.connection(), request.headers()));

            Response response = chain.proceed(request);

            long t2 = System.nanoTime();
            Log.d("retrofit", String.format("Received response for %s in %.1fms%n%s",
                    response.request().url(), (t2 - t1) / 1e6d, response.headers()));

            final String responseString = new String(response.body().bytes());

            Log.d("retrofit", "Response: " + responseString);

            return response.newBuilder()
                    .body(ResponseBody.create(response.body().contentType(), responseString))
                    .build();
        }
    };

    public static HttpManager getInstance() {
        if (instance == null) {
            instance = new HttpManager();
        }
        return instance;
    }

    public ApiService getService() {
        return service;
    }

    private HttpManager() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        switch (1) {
            case 1:
                url = "http://foo.bar/api/";
                break;
        }

        if (url != null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(myInterceptor)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .client(client)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            service = retrofit.create(ApiService.class);
        }
    }
}
