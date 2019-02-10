package xyz.huizhe.lotterydraw.mapper;

import xyz.huizhe.lotterydraw.vo.Participant;

import java.util.List;

public interface ParticipantMapper extends BasicMapper<Participant> {
    int deleteByPrimaryKey(Integer participantsId);

    int insert(Participant record);

    int insertSelective(Participant record);

    Participant selectByPrimaryKey(Integer participantsId);

    int updateByPrimaryKeySelective(Participant record);

    int updateByPrimaryKey(Participant record);

    List<Participant> getAllByActivityId(Integer activityId);

}