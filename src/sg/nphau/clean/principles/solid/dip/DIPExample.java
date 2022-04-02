/**
 * Created by nphau on 07/03/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 07/03/2022, 15:54
 */
package sg.nphau.clean.principles.solid.dip;

public class DIPExample {
    public static void main(String[] args) {
        LoggingToFile loggingToFile = new LoggingToFile(new Logger());
        loggingToFile.logging();
        LoggingToDb loggingToDb = new LoggingToDb(new Logger());
        loggingToDb.logging();
    }
}
