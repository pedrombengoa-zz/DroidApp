package ar.edu.unlp.application;

import ar.edu.unlp.domain.StarterData;
import ar.edu.unlp.domain.StarterDataRepository;

import io.reactivex.Single;

public class GetStarterData {
    private StarterDataRepository starterDataRepository;

    public GetStarterData(StarterDataRepository starterDataRepository) {
        this.starterDataRepository = starterDataRepository;
    }

    public Single<String> execute() {
        return starterDataRepository
                .getStarterData()
                .map(StarterData::getMessage);
    }
}
