/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package com.nphausg.clean.principles.solid.dip;

public class LoggingToFile {
    private ILogger logger;

    public LoggingToFile(ILogger logger) {
        this.logger = logger;
    }

    public void logging() {
        this.logger.logInformation("Printing logs to the file ...");
    }
}
