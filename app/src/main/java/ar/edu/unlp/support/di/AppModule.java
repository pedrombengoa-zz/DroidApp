package ar.edu.unlp.support.di;

import android.content.Context;

import ar.edu.unlp.application.GetStarterData;
import ar.edu.unlp.application.MainPresenter;
import ar.edu.unlp.domain.StarterDataRepository;
import ar.edu.unlp.infraestructure.DummyStarterDataRepository;
import ar.edu.unlp.support.config.Configuration;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;
    Configuration configuration;

    public AppModule(Context context, Configuration configuration) {
        this.context = context;
        this.configuration = configuration;
    }

    @Provides
    public MainPresenter mainPresenter(GetStarterData getStarterData) {
        return new MainPresenter(getStarterData);
    }

    @Provides
    public StarterDataRepository starterDataRepository() {
        return new DummyStarterDataRepository(context);
    }

    @Provides
    public GetStarterData getStarterData(StarterDataRepository starterDataRepository) {
        return new GetStarterData(starterDataRepository);
    }
}
