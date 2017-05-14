package hr.asseco.android.jokeandroid;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import hr.asseco.android.jokeandroid.buisnesslogic.Joke;
import hr.asseco.android.jokeandroid.buisnesslogic.JokesInteractor;
import io.reactivex.observers.DisposableObserver;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("hr.asseco.android.jokeandroid.test", appContext.getPackageName());
    }

    @Test
    public void checkJokeNotNull(){
        JokesInteractor jokesInteractor = new JokesInteractor();

        jokesInteractor.getNextJoke().subscribeWith(new DisposableObserver<Joke>() {
            @Override
            public void onNext(Joke value) {
                assertNotNull(value.getJoke());
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
