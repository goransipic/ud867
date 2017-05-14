package hr.asseco.android.jokeandroid;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

import hr.asseco.android.jokeandroid.buisnesslogic.Joke;
import hr.asseco.android.jokeandroid.buisnesslogic.JokesInteractor;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by gsipic on 14.5.2017..
 */

public class TellMePresenter extends MvpBasePresenter<TellMeContract.TellMeView> implements TellMeContract.TellMePresenter {

    JokesInteractor mJokesInteractor;

    public TellMePresenter(JokesInteractor mJokesInteractor) {
        this.mJokesInteractor = mJokesInteractor;
    }

    @Override
    public void getJokes() {
        mJokesInteractor.getNextJoke()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<Joke>() {
                    @Override
                    public void onNext(@NonNull Joke s) {
                        getView().showJokes(s);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
