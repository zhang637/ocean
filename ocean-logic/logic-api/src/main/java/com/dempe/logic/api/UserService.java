package com.dempe.logic.api;

import com.alibaba.fastjson.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/4/27
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    /**
     * 用户登录接口
     * @param uid 用户uid
     * @param pwd 用户登录密码
     * @return
     */
    public JSONObject login(String uid, String pwd);

    public JSONObject imInit();

    public JSONObject chInit();

}
