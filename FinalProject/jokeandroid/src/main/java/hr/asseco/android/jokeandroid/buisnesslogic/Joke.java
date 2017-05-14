package hr.asseco.android.jokeandroid.buisnesslogic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gsipic on 14.5.2017..
 */

public class Joke {
    String joke;

    public String getJoke() {
        return joke;
    }

    @SerializedName("joke")
    public void setJoke(String mJoke) {
        this.joke = mJoke;
    }
}
