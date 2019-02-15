package com.onyx.note.conf;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * @author lxg
 * 统一记录web下的某些接口的访问信息，用于后面统计
 */
@Aspect
@Component
@Order(1)
public class WebLogAspect {
    private final static Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
    private ThreadLocal<Long> startTime = new ThreadLocal<>();
    
    @Pointcut("execution(public * com.onyx.note.controller..*.*(..))")
    public void webLog(){}
    
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        logger.info("url ==> " + request.getRequestURL().toString());
        logger.info("http_method ==> " + request.getMethod());
        logger.info("remote_ip ==> " + request.getRemoteAddr());
        logger.info("class_method ==> " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        String args = "";
        if (request.getMethod().equals(RequestMethod.GET.name())) {
            args = request.getQueryString();
        } else if (request.getMethod().equals(RequestMethod.POST.name())) {
            args = JSONObject.toJSONString(request.getParameterMap());
        }

        logger.info("args ==> " + args);
    }
    
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("response <== " + JSONObject.toJSONString(ret));
        logger.info("spend time ==> " + (System.currentTimeMillis() - startTime.get()));
    }
}