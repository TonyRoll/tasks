package com.epam.task.task3;

public abstract class Item {

    private Long invNumber;
    private boolean taken;

    public Item(Long invNumber, boolean taken) {
        this.invNumber = invNumber;
        this.taken = taken;
    }

    public Long getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(Long invNumber) {
        this.invNumber = invNumber;
    }

    public boolean isAvailable() {
        return taken;
    }

    public void setAvailable(boolean taken) {
        this.taken = taken;
    }

    public void take() {
        this.taken = true;
    }

    public void returN(){
        this.taken = false;
    }

    public abstract void show();

}
