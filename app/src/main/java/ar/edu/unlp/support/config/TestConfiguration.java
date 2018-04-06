package ar.edu.unlp.support.config;

public class TestConfiguration implements Configuration {

    @Override
    public Environment getEnvironment() {
        return Environment.TEST;
    }
}
