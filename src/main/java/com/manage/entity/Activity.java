package com.manage.entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
/**
 * 
 * @author ChenYuhao
 *
 * Activity 活动
 */
public class Activity implements Serializable {
    /**
     * 执行序列化id
     */
    private static final long serialVersionUID = 2761423697905688288L;
    private Integer activityid; // 活动id
    private Student stu; // 活动发起人 数据库添加
    private StuActivity stuactivity;//中间表申请活动
    private ReportActivity reportActivity;//举报活动
    private Community community;//社团
    private Integer activityTypeid;//活动类型
    private String activityTitle; // 活动标题 
    private String activityLoc; // 活动地点
    private String activityContent; // 活动内容
    private Date activityDate; // 活动发表(发起)时间
    private Date closingDate; // 活动报名截止时间
    private Date startDate; // 活动开始时间
    private Date endDate; // 活动结束时间
    private Integer status; // 是否被删除,这里只做一个标记
    private Set<ReplyActivity> replyActivities;
    private Set<ReportActivity> reportActivities;
    private List<Photos> photo;
    public ReportActivity getReportActivity() {
        return reportActivity;
    }

    public void setReportActivity(ReportActivity reportActivity) {
        this.reportActivity = reportActivity;
    }

    public Integer getActivityTypeid() {
        return activityTypeid;
    }

    public void setActivityTypeid(Integer activityTypeid) {
        this.activityTypeid = activityTypeid;
    }

    
    public StuActivity getStuactivity() {
        return stuactivity;
    }

    public void setStuactivity(StuActivity stuactivity) {
        this.stuactivity = stuactivity;
    }

    public List<Photos> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photos> photo) {
        this.photo = photo;
    }

    private Set<Student> students;//活动参加的人
    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }


    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    public Set<ReportActivity> getReportActivities() {
        return reportActivities;
    }

    public void setReportActivities(Set<ReportActivity> reportActivities) {
        this.reportActivities = reportActivities;
    }

    public Set<ReplyActivity> getReplyActivities() {
        return replyActivities;
    }

    public void setReplyActivities(Set<ReplyActivity> replyActivities) {
        this.replyActivities = replyActivities;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }
    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityLoc() {
        return activityLoc;
    }

    public void setActivityLoc(String activityLoc) {
        this.activityLoc = activityLoc;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }
    public Date getCloseingDate() {
        return closingDate;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
