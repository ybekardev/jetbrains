package org.jetBrains.designpatterns.abstractfactory;

public class KitchenTableFactory implements TableFactory{
    @Override
    public Table makeTable() {
        return new KitchenTable();
    }

    @Override
    public TableTools makeTableTools() {
        return new KitchenTableTools();
    }
}
