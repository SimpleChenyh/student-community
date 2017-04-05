package com.manage.entity;

import java.io.Serializable;

/**
 * 
 * @author ChenYuhao
 * 关注问题
 * 
 */
public class AttentionProblem implements Serializable {

    /**
     * 指定序列化id
     */
    private static final long serialVersionUID = -3074956370267397673L;
    private Student stu;
    private Problem peoblem;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Problem getPeoblem() {
        return peoblem;
    }

    public void setPeoblem(Problem peoblem) {
        this.peoblem = peoblem;
    }

}
