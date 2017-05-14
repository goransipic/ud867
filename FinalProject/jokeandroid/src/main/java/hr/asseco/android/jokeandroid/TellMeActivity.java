package hr.asseco.android.jokeandroid;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;

import hr.asseco.android.jokeandroid.buisnesslogic.Joke;
import hr.asseco.android.jokeandroid.buisnesslogic.JokesInteractor;

public class TellMeActivity extends MvpActivity<TellMeContract.TellMeView,TellMeContract.TellMePresenter> implements TellMeContract.TellMeView{

    private TextView mTvTellMe;

    public static final String EXTRA_TELL_ME = ".tellme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_me);

        mTvTellMe = (TextView) findViewById(R.id.tv_tell_me);

        getPresenter().getJokes();

    }


    @Override
    public void showJokes(Joke joke) {
        Toast.makeText(this, joke.toString(), Toast.LENGTH_SHORT).show();
        mTvTellMe.setText(joke.getJoke());
    }

    @NonNull
    @Override
    public TellMeContract.TellMePresenter createPresenter() {
        return new TellMePresenter(new JokesInteractor());
    }

    public static void startIntent(Context context, String tellMe) {
        Intent intent = new Intent();
        intent.setClass(context,TellMeActivity.class);

        intent.putExtra(EXTRA_TELL_ME,tellMe);
        context.startActivity(intent);
    }

}
