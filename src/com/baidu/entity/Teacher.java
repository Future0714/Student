package com.baidu.entity;

public class Teacher {
    private int tid;
    private String snmae;
    private int age;
    public Teacher() {
    }

    public Teacher(int tid, String snmae) {
        this.tid = tid;
        this.snmae = snmae;
    }

    public Teacher(int tid, String snmae, int age) {
        this.tid = tid;
        this.snmae = snmae;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
