package org.jetBrains.designpatterns.singleton;

public class StatementFactory extends Factory{

    private static StatementFactory uniqueInstance;

    private StatementFactory(){}

    public static StatementFactory getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new StatementFactory();
            System.out.println("\nCreating a new statement factory instance...");
        }
        return uniqueInstance;
    }

    @Override
    protected StatementType createStatement(String selection) {
        if(selection.equalsIgnoreCase("detailed")){
            return new DetailedStatement();
        }else if (selection.equalsIgnoreCase("mini")){
            return new MiniStatement();
        }
        throw new IllegalArgumentException("Selection does not exist!");
    }
}
