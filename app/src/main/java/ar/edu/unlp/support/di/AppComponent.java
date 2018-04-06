package ar.edu.unlp.support.di;

import ar.edu.unlp.application.MainActivity;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
