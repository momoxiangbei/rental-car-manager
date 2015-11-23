package com.mmxb.mgr.server.imp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mmxb.mgr.mapper.UserMapper;
import com.mmxb.mgr.pojo.User;
import com.mmxb.mgr.server.BaseServer;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Xing on 2015/11/23.
 */
@RestController
@Transactional
@RequestMapping("mgr/test")
public class TestServer extends BaseServer{

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public Object query() {
        JSONObject jsonObject = new JSONObject();
        SqlSession sqlSession = openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        JSONObject json = (JSONObject) JSON.toJSON(user);
        jsonObject.put("success", true);
        jsonObject.put("data", json);
        return jsonObject;
    }

}
