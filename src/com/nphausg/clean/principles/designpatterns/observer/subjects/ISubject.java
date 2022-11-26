/**
 * Created by nphau on 01/04/2022, 00:30
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 01/04/2022, 15:54
 */
package com.nphausg.clean.principles.designpatterns.observer.subjects;

import com.nphausg.clean.principles.designpatterns.observer.observers.IObserver;

public interface ISubject {

    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();

}
