package xyz.huizhe.lotterydraw.vo;

import java.util.Date;

public class Participant {
    private Integer participantsId;

    private Integer activityId;

    private String username;

    private String phone;

    private String type;

    private String nickname;

    private String avatarUrl;

    private Date createAt;

    private Date updateAt;

    public Participant(Integer participantsId, Integer activityId, String username, String phone, String type, String nickname, String avatarUrl, Date createAt, Date updateAt) {
        this.participantsId = participantsId;
        this.activityId = activityId;
        this.username = username;
        this.phone = phone;
        this.type = type;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Participant() {
        super();
    }

    public Integer getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(Integer participantsId) {
        this.participantsId = participantsId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
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
}