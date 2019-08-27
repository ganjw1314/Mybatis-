package com.mybatis.interfaces;

import java.lang.reflect.Method;

/**
 * 拦截器借口
 */
public interface Interceptor {
    /*
        proxy : 代理对象
        target : 真实对象
        method : method方法
        args : 运行方法
        before方法返回boolean值，它在真实对象前调用，当返回true时，则反射真实对象的方法；
        当返回false时，则调用around方法；
     */
    public boolean before(Object proxy, Object target, Method method, Object[] args);
    public void around(Object proxy, Object target, Method method, Object[] args);
    public void after(Object proxy, Object target, Method method, Object[] args);
}
