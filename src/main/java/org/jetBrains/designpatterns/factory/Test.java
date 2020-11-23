package org.jetBrains.designpatterns.factory;

import org.jetBrains.designpatterns.factory.TableFactory.TableStore;

public class Test {

    public static void main(String[] args) {
        TableStore tableStore = new TableStore();
        Table strangeTable = tableStore.orderTable("Mysterious table");
        Table officeTable = tableStore.orderTable("office");
        Table kitchenTable = tableStore.orderTable("kitchen");

    }
}

