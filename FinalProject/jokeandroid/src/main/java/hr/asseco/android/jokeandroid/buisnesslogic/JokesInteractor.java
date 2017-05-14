package hr.asseco.android.jokeandroid.buisnesslogic;

import hr.asseco.android.jokeandroid.BuildConfig;
import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by gsipic on 30.4.2017..
 */

public class JokesInteractor {
    //private static MyEndpoint myApiService = null;
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BuildConfig.END_POINT)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();

    public Observable<Joke> getNextJoke() {
        return retrofit.create(ApiService.class).getJokes();
    }

}
