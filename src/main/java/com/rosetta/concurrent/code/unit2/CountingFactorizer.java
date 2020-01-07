package com.rosetta.concurrent.code.unit2;

import javax.servlet.*;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description 使用AtomicLong类型的变量来统计已处理请求的数量
 *  在 java.util.concurrent.atomic 包中包含了一些原子变量类,用于实现在数值和对象引用上的原子状态转换.
 *  在实际情况中,应尽可能地使用现有的线程安全对象来管理类的状态.
 *  与非线程安全的对象相比,判断线程安全对象的可能状态及其状态转换情况要更为容易,从而也更容易维护和验证线程安全性.
 * @Author nya
 * @Date 2020/1/6 下午1:58
 **/
public class CountingFactorizer implements Servlet {

    private final AtomicLong count = new AtomicLong(0);

    public long getCount() {
        return count.get();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // ...
        count.incrementAndGet();
        // ...
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
