/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
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
