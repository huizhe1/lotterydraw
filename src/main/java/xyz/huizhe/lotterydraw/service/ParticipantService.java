package xyz.huizhe.lotterydraw.service;

import xyz.huizhe.lotterydraw.common.ServerResponse;
import xyz.huizhe.lotterydraw.service.common.BasicService;
import xyz.huizhe.lotterydraw.vo.Participant;

/**
 * @author huizhe
 * @date 2019/2/10
 * @time 15:02
 */
public interface ParticipantService extends BasicService<Participant> {

    ServerResponse getAllByActivityId(int activityId, int pageNum, int pageSize);
}
