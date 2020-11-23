package org.jetBrains.designpatterns.factory;

public abstract class TableFactory {

    abstract Table createTable(String type);

    Table orderTable(String type) {
        Table table = createTable(type);
        if (table == null) {
            System.out.println("Sorry, out of stock");
            return null;
        }
        System.out.println("Making the table: " + table.getName());
        table.attachLegs();
        table.attachTableTop();
        System.out.println("Created...");

        return table;
    }

    static class TableStore extends TableFactory {

        @Override
        Table createTable(String type) {
            if (type.equals("office")) {
                return new TableOffice("Office Table");
            } else if (type.equals("kitchen")) {
                return new TableKitchen("Kitchen Table");
            } else {
                return null;
            }
        }
    }
}
