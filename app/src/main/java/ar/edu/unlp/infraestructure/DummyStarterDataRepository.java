package ar.edu.unlp.infraestructure;

import android.content.Context;

import ar.edu.unlp.R;
import ar.edu.unlp.domain.StarterData;
import ar.edu.unlp.domain.StarterDataRepository;

import io.reactivex.Single;

public class DummyStarterDataRepository implements StarterDataRepository {

    Context context;

    public DummyStarterDataRepository(Context context) {
        this.context = context;
    }

    @Override
    public Single<StarterData> getStarterData() {

        String appName = context.getResources().getString(R.string.app_name);

        StarterData data = new StarterData("Hello " + appName + "!");
        return Single.just(data);
    }
}
