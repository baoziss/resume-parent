package com.baoziss.advice;

import com.alibaba.fastjson.JSONObject;
import com.baoziss.annotation.JedisQuery;
import com.baoziss.entity.Information;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import redis.clients.jedis.Jedis;
import util.Md5Util;

/**
 * 简历缓存设置
 */
public class ResumeAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Jedis jedis = new Jedis("192.168.13.128", 6379);
        jedis.select(0);

        String name = invocation.getThis().getClass().getName();
        String name1 = invocation.getMethod().getName();
        String methodName = name+"."+name1;//获得方法名
        Object[] arguments = invocation.getArguments();//获得所有参数
        StringBuilder sb = new StringBuilder();
        for (Object argument : arguments) {
            sb.append(argument);
        }
        Object proceed = null;
        String key= Md5Util.getMd5Code(name)+Md5Util.getMd5Code(methodName+sb);

        boolean isQuery = invocation.getMethod().isAnnotationPresent(JedisQuery.class);

        if(isQuery){
            if(jedis.exists(key)){
                String s = jedis.get(key);
                JSONObject jsonObject = JSONObject.parseObject(s);
                jedis.close();
                return JSONObject.toJavaObject(jsonObject,Information.class);
            }
            Information infor = (Information)invocation.proceed();
            jedis.set(key,JSONObject.toJSONStringWithDateFormat(infor,"yyyy-MM-dd"));
            proceed = infor;
        }else {
            jedis.del(key);
            invocation.proceed();
        }
        jedis.close();
        return proceed;
    }
}
