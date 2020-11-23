package org.jetBrains.designpatterns.staticfactory;

public class ComputerStaticFactory {

    public static Computer newInstance(ComputerType type) {
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
