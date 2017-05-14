package hr.asseco.android.jokeandroid;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import hr.asseco.android.jokeandroid.buisnesslogic.Joke;

/**
 * Created by gsipic on 14.5.2017..
 */

interface TellMeContract {

    interface  TellMeView extends MvpView {
        void showJokes(Joke joke);
    }

    interface TellMePresenter extends MvpPresenter<TellMeView> {
        void getJokes();
    }
}
