package xyz.huizhe.lotterydraw.mapper;

import xyz.huizhe.lotterydraw.vo.Activity;


public interface ActivityMapper extends BasicMapper<Activity> {
    int deleteByPrimaryKey(Integer activityId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

}