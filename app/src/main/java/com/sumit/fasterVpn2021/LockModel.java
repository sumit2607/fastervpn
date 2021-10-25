package com.sumit.fasterVpn2021;

public class LockModel {

    private boolean lock;

    public LockModel() {
        lock = false;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }
}
