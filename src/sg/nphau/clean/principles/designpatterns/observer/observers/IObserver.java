/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package sg.nphau.clean.principles.designpatterns.observer.observers;

import sg.nphau.clean.principles.designpatterns.observer.domain.Employee;

/**
 * This interface defines the method that the subject will call when it
 * wants to notify its list of observers. This is actually the callback method
 * from what I understand.
 */
public interface IObserver {
    // When something changes in the subject it should call this method
    void callMe(Employee emp, String msg);
}
