package org.jetBrains.designpatterns.staticfactory;

public class FactoryClient {

    public static void main(String[] args) {

        Computer computer = ComputerStaticFactory.newInstance(ComputerType.COMPUTER);
        //System.out.println(computer.getRam());
        //System.out.println(computer.getCpu());
        //System.out.println(computer.getScreenSize());
        System.out.println(computer instanceof Computer);

        //ComputerStaticFactory computerStaticFactory = new ComputerStaticFactory();
        Computer computer1 = ComputerStaticFactory.newInstance(ComputerType.LAPTOP);

        //non static must create the object to call
        ComputerNONStaticFactory computerNonStaticFactory = new ComputerNONStaticFactory();
        Computer computer2 = computerNonStaticFactory.newInstance(ComputerType.PC);
        Computer computer3 = computerNonStaticFactory.newInstance(ComputerType.LAPTOP);
        Computer computer4 = computerNonStaticFactory.newInstance(ComputerType.COMPUTER);
    }


}
