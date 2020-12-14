package org.jetBrains.oop.concepts.interfaceConcept;

public abstract class AbstractDevice implements ManagedDevices{
    protected String serialNumber;
    protected boolean on;

    public AbstractDevice(String serialNumber){
        this.serialNumber = serialNumber;
    }
    protected void setOn(boolean on){
        this.on = on;
    }
}



