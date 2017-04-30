package hr.asseco.android.jokeandroid;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TellMeActivity extends AppCompatActivity {

    private TextView mTvTellMe;

    public static final String EXTRA_TELL_ME = ".tellme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_me);

        mTvTellMe = (TextView) findViewById(R.id.tv_tell_me);
        mTvTellMe.setText(getIntent().getStringExtra(EXTRA_TELL_ME));
    }

    public static void startIntent(Context context, String tellMe) {
        Intent intent = new Intent();
        intent.setClass(context,TellMeActivity.class);

        intent.putExtra(EXTRA_TELL_ME,tellMe);
        context.startActivity(intent);
    }

}
