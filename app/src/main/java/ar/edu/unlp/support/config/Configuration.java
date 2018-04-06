package ar.edu.unlp.support.config;

public interface Configuration {

    public Environment getEnvironment();

    public enum Environment {
        PRO, PRE, TEST, DEV
    }
}
