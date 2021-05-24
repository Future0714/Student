package com.baidu.entity;

public class Teacher {
    private int tid;
    private String snmae;

    public Teacher() {
    }

    public Teacher(int tid, String snmae) {
        this.tid = tid;
        this.snmae = snmae;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getSnmae() {
        return snmae;
    }

    public void setSnmae(String snmae) {
        this.snmae = snmae;
    }
}
