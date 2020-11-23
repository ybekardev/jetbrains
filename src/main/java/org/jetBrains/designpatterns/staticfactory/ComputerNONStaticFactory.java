package org.jetBrains.designpatterns.staticfactory;

public class ComputerNONStaticFactory {

    //The simple factory idiom has the same features as the static factory.
    //But, unlike with the static factory, it is possible to create multiple differently parameterized factories to control instantiating.
    //You can also subclass the factory and override its non-static method that is used to create other factories.

    public Computer newInstance(ComputerType type) {
        switch (type) {
            case COMPUTER:
                return new Computer(128, 234, 12.5, ComputerType.COMPUTER);
            case LAPTOP:
                return new Laptop(565, 320, 17.00, ComputerType.LAPTOP);
            case PC:
                return new PC(620, 120, 15.00, ComputerType.PC);
            default:
                System.out.println("Invalid type!");

        }
        return null;
    }


}
