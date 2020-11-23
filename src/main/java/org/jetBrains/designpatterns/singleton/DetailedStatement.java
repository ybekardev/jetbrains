package org.jetBrains.designpatterns.singleton;

public class DetailedStatement implements StatementType {

    @Override
    public String printStatement() {
        System.out.println("\nCreating your detailed statement...");
        return "Detailed statement";
    }
}
