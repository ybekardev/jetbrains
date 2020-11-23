package org.jetBrains.designpatterns.abstractfactory;

public class DemoAbstractFactory {

    public static void main(String[] args) {

        Table table;
        TableTools tableTools;

        TableFactory kitchenTableFactory = new KitchenTableFactory();
        TableFactory officeTableFactory = new OfficeTableFactory();

        System.out.println("Making a kitchen table...");
        table = kitchenTableFactory.makeTable();
        tableTools = kitchenTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTools());

        System.out.println("Making an office table...");
        table = officeTableFactory.makeTable();
        tableTools = officeTableFactory.makeTableTools();

        System.out.println(table.getTable() + "\n" + tableTools.getTools());



    }
}
