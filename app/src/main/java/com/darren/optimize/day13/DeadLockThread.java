package com.darren.optimize.day13;

public class DeadLockThread {
    int curThreadId;
    int blockThreadId;
    Thread thread;

    public DeadLockThread(int curThreadId, int blockThreadId, Thread thread) {
        this.curThreadId = curThreadId;
        this.blockThreadId = blockThreadId;
        this.thread = thread;
    }
}
