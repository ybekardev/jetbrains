package org.jetBrains.designpatterns.abstractfactory;

public class OfficeTableFactory implements TableFactory{
    @Override
    public Table makeTable() {
        return new OfficeTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new OfficeTableTools();
    }
}
