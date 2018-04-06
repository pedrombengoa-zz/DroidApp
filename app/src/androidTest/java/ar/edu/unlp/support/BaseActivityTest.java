package ar.edu.unlp.support;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Rule;
import ar.edu.unlp.application.MainActivity;
import ar.edu.unlp.support.config.TestConfiguration;
import ar.edu.unlp.support.di.AppComponent;
import ar.edu.unlp.support.di.AppModule;

import it.cosenonjaviste.daggermock.DaggerMockRule;

public abstract class BaseActivityTest {

    private AppModule appModule = new TestAppModule(getApp(), new TestConfiguration());

    @Rule
    public IntentsTestRule<MainActivity> activity = new IntentsTestRule<>(MainActivity.class, true, false);

    @Rule
    public DaggerMockRule<AppComponent> daggerMockRule = new DaggerMockRule<>(AppComponent.class, appModule)
            .set(component -> {
                Bootstrap app = getApp();
                app.setComponent(component);
            });

    private Bootstrap getApp() {
        return (Bootstrap) InstrumentationRegistry.getInstrumentation()
                .getTargetContext()
                .getApplicationContext();
    }

    protected TestAppModule getAppModule() {
        return (TestAppModule) appModule;
    }
}
