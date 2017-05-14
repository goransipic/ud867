package hr.asseco.android.jokeandroid.buisnesslogic;

/*
 * Created by gsipic on 14.5.2017..
 */

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST("hello")
    Observable<Joke> getJokes();
}
