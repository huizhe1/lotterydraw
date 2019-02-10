package xyz.huizhe.lotterydraw.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.huizhe.lotterydraw.common.CheckSQL;
import xyz.huizhe.lotterydraw.common.ServerResponse;
import xyz.huizhe.lotterydraw.mapper.ParticipantMapper;
import xyz.huizhe.lotterydraw.service.ParticipantService;
import xyz.huizhe.lotterydraw.vo.Participant;

/**
 * @author huizhe
 * @date 2019/2/10
 * @time 15:03
 */
@Service
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    private ParticipantMapper mapper;
    
    @Override
    public ServerResponse findOneById(int id) {
        return CheckSQL.returnServerResponse(mapper.selectByPrimaryKey(id));
    }

    @Override
    public ServerResponse addInfo(Participant info) {
        try {
            return CheckSQL.returnServerResponse(mapper.insert(info), "添加参与者参与抽奖活动成功", "添加参与者参与抽奖活动失败");
        } catch (Exception e) {
            return CheckSQL.returnErrorIllegalArgumnet("添加参与者参与抽奖活动失败");
        }
    }

    @Override
    public ServerResponse updateInfo(Participant info) {
        try {
            return CheckSQL.returnServerResponse(mapper.updateByPrimaryKeySelective(info), "修改参与者参与抽奖活动成功", "修改参与者参与抽奖活动失败");
        } catch (Exception e) {
            return CheckSQL.returnErrorIllegalArgumnet("修改参与者参与抽奖活动失败");
        }
    }

    @Override
    public ServerResponse deleteById(int id) {
        return CheckSQL.returnServerResponse(mapper.deleteByPrimaryKey(id), "删除参与者参与抽奖活动成功", "删除参与者参与抽奖活动失败");

    }

    @Override
    public Integer getTheLast() {
        return mapper.getTheLast();
    }

    @Override
    public ServerResponse getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return CheckSQL.returnServerResponse(new PageInfo<>(mapper.getAll()));
    }

    @Override
    public ServerResponse getAllByActivityId(int activityId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return CheckSQL.returnServerResponse(new PageInfo<>(mapper.getAllByActivityId(activityId)));
    }
}
