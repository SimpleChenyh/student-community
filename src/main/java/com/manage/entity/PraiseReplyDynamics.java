package com.manage.entity;

import java.io.Serializable;

/**
 * 
 * @author ChenYuhao
 * 赞动态的回复
 */
public class PraiseReplyDynamics implements Serializable {
    /**
     * 序列化id
     */
    private static final long serialVersionUID = -7115201138829373013L;
    private Integer praiseReplyDynamicsid;
    private Student stu;
    private Dynamics dynamics;

    public Integer getPraiseReplyDynamicsid() {
        return praiseReplyDynamicsid;
    }

    public void setPraiseReplyDynamicsid(Integer praiseReplyDynamicsid) {
        this.praiseReplyDynamicsid = praiseReplyDynamicsid;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Dynamics getDynamics() {
        return dynamics;
    }

    public void setDynamics(Dynamics dynamics) {
        this.dynamics = dynamics;
    }

}