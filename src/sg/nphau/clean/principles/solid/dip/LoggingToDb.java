package sg.nphau.clean.principles.solid.dip;

public class LoggingToDb {
    private ILogger logger;

    public LoggingToDb(ILogger logger) {
        this.logger = logger;
    }

    public void logging() {
        this.logger.logInformation("Saving logs to the database ...");
    }
}
