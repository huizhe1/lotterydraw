package xyz.huizhe.lotterydraw.vo;

import java.util.Date;

public class Activity {
    private Integer activityId;

    private String activityName;

    private Short type;

    private Date createAt;

    private Date updateAt;

    private Date drawAt;

    public Activity(Integer activityId, String activityName, Short type, Date createAt, Date updateAt, Date drawAt) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.type = type;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.drawAt = drawAt;
    }

    public Activity() {
        super();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDrawAt() {
        return drawAt;
    }

    public void setDrawAt(Date drawAt) {
        this.drawAt = drawAt;
    }
}