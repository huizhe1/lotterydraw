package xyz.huizhe.lotterydraw.common;

/**
 * @author huizhe
 * @date 2019/1/6
 * @time 13:49
 */
public class CheckSQL  {

    public static ServerResponse returnServerResponse(int rowCount, String success, String error) {
        if (0 < rowCount) {
            return ServerResponse.createBySuccessMessage(success);
        }
        return ServerResponse.createByErrorMessage(error);
    }

    public static ServerResponse returnServerResponse(Object data, String success, String error) {
        if (null != data) {
            return ServerResponse.createBySuccess(success, data);
        }
        return ServerResponse.createByErrorMessage(error);
    }

    public static ServerResponse returnServerResponse(Object data) {
        return ServerResponse.createBySuccess("获取数据成功", data);
    }

    public static ServerResponse returnErrorIllegalArgumnet() {
        return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMNET.getCode(), ResponseCode.ILLEGAL_ARGUMNET.getDesc());
    }

    public static ServerResponse returnErrorIllegalArgumnet(String error) {
        return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMNET.getCode(), error);
    }

    public static ServerResponse returnSuccess() {
        return ServerResponse.createBySuccessMessage(ResponseCode.SUCCESS.getDesc());
    }

    public static ServerResponse returnSuccess(String success) {
        return ServerResponse.createBySuccessMessage(success);
    }

}
