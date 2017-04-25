package com.manage.entity;

import java.io.Serializable;
import java.sql.Date;
/**
 * 
 * @author ChenYuhao
 *  踩讨论的回复
 */
public class AgainstReplyDiscuss implements Serializable {
    /**
     * 指定序列化id
     */
    private static final long serialVersionUID = 5327047271797095730L;
    private Student stu;
    private ReplyDiscuss replyDiscuss;
    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public ReplyDiscuss getReplyDiscuss() {
        return replyDiscuss;
    }

    public void setReplyDiscuss(ReplyDiscuss replyDiscuss) {
        this.replyDiscuss = replyDiscuss;
    }

}
