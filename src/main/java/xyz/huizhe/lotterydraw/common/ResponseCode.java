package xyz.huizhe.lotterydraw.common;

/**
 * @author huizhe
 * @date 2019/1/1
 * @time 15:33
 */
public enum ResponseCode {
    SUCCESS(200, "SUCCESS"),
    ERROR(400, "ERROR"),
    NEED_LOGIN(403 ,"NEED_LOGIN"),
    ILLEGAL_ARGUMNET(404, "ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
