package ar.edu.unlp.domain;

import io.reactivex.Single;

public interface StarterDataRepository {
    public Single<StarterData> getStarterData();
}
