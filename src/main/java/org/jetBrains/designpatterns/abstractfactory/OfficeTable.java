package org.jetBrains.designpatterns.abstractfactory;

public class OfficeTable implements Table {
    @Override
    public String getTable() {
        return "Returning an office table";
    }
}
