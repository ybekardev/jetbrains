package org.jetBrains.designpatterns.abstractfactory;

public interface TableFactory {
    Table makeTable();
    TableTools makeTableTools();
}
