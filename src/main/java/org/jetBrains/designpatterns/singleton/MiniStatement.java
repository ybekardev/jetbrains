package org.jetBrains.designpatterns.singleton;

public class MiniStatement implements StatementType{
    @Override
    public String printStatement() {
        System.out.println("\nCreating your mini statement...");
        return "Mini statement";
    }
}
