package com.bupt.flowpackage.common.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.bupt.flowpackage.common.domain.SessionVo;
import com.bupt.flowpackage.common.session.SessionUtil;

public class LoginInteceptor  extends HandlerInterceptorAdapter{
	public static Logger logger = LoggerFactory.getLogger(LoginInteceptor.class);
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		SessionVo sessionInfo = SessionUtil.getSessionInfo(request.getSession());
		if(sessionInfo == null) {
			logger.info("\n用户未登陆或session过期, 强制跳转到tologin登陆页");
			response.sendRedirect("/tologin");
			return false;
		}
		return true;
	}
}