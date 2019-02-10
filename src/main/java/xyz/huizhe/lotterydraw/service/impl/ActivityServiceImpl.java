package xyz.huizhe.lotterydraw.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.huizhe.lotterydraw.common.CheckSQL;
import xyz.huizhe.lotterydraw.common.ServerResponse;
import xyz.huizhe.lotterydraw.mapper.ActivityMapper;
import xyz.huizhe.lotterydraw.service.ActivityService;
import xyz.huizhe.lotterydraw.vo.Activity;

/**
 * @author huizhe
 * @date 2019/2/10
 * @time 14:28
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper mapper;

    @Override
    public ServerResponse findOneById(int id) {
        return CheckSQL.returnServerResponse(mapper.selectByPrimaryKey(id));
    }

    @Override
    public ServerResponse addInfo(Activity info) {
        try {
            return CheckSQL.returnServerResponse(mapper.insert(info), "添加抽奖活动成功", "添加抽奖活动失败");
        } catch (Exception e) {
            return CheckSQL.returnErrorIllegalArgumnet("添加抽奖活动失败");
        }
    }

    @Override
    public ServerResponse updateInfo(Activity info) {
        try {
            return CheckSQL.returnServerResponse(mapper.updateByPrimaryKeySelective(info), "修改抽奖活动成功", "修改抽奖活动失败");
        } catch (Exception e) {
            return CheckSQL.returnErrorIllegalArgumnet("修改抽奖活动失败");
        }
    }

    @Override
    public ServerResponse deleteById(int id) {
        return CheckSQL.returnServerResponse(mapper.deleteByPrimaryKey(id), "删除抽奖活动成功", "删除抽奖活动失败");
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
}
