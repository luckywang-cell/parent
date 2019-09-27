package com.it.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: WangXiang
 * @Description:
 * @Date: 2019/9/26 18:08
 */
@Component
public class SecurityFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //  pre 路由之前
        //  routing 路由之时
        //  post 路由之后
        //  error 发送错误调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //  true 表示拦截
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //  获取Request与Response接口对接
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if (token == null) {
            context.setSendZuulResponse(false);
            //  状态码
            context.setResponseStatusCode(401);
            try {
                //  返回响应
                context.getResponse().getWriter().write("request failure, you do not have security token ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //  return null 表示直接越过此filter
        return null;
    }
}
