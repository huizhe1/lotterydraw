package xyz.huizhe.lotterydraw.mapper;

import java.util.List;

/**
 * @author huizhe
 * @date 2019/2/10
 * @time 14:43
 */
public interface BasicMapper<T> {

    Integer getTheLast();

    List<T> getAll();

}
