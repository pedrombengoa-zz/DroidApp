package ar.edu.unlp.support;

import android.content.Context;

import ar.edu.unlp.domain.StarterData;
import ar.edu.unlp.domain.StarterDataRepository;
import ar.edu.unlp.support.config.Configuration;
import ar.edu.unlp.support.di.AppModule;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Single;

@Module
public class TestAppModule extends AppModule {
    private String message = "Test App Module Message";

    public void setMessage(String message) {
        this.message = message;
    }

    public TestAppModule(Context context, Configuration configuration) {
        super(context, configuration);
    }

    @Provides
    @Override
    public StarterDataRepository starterDataRepository() {
        return () -> Single.just(new StarterData(message));
    }

}
