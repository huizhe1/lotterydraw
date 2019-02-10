package xyz.huizhe.lotterydraw.service.common;

import xyz.huizhe.lotterydraw.common.ServerResponse;

/**
 * @author huizhe
 * @date 2019/2/10
 * @time 14:29
 */
public interface BasicService<T> {

    ServerResponse findOneById(int id);

    ServerResponse addInfo(T info);

    ServerResponse updateInfo(T info);

    ServerResponse deleteById(int id);

    Integer getTheLast();

    ServerResponse getAll(int pageNum, int pageSize);


}
