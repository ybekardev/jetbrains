package org.jetBrains.designpatterns.singleton;

public abstract class Factory {

    protected abstract StatementType createStatement(String selection);

}
