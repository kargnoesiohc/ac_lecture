package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

@Component("myInterceptor")
public class MyHandlerInterceptor extends HandlerInterceptorAdapter{  //HandlerInterceptorAdapter 상속
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle() 호출  "+handler);
		HttpSession session = request.getSession();
				if(session.getAttribute("login") == null) {
					System.out.println("로그인 정보 없음");
				}
		return true;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle() 호출  "+handler);
		HandlerMethod method = (HandlerMethod) handler;
		if(method.getBean() instanceof TestController) {
			System.out.println("TestController의 경우 postHandler에서 view페이지 설정");
			mav.addObject("data", "홍길동");
			mav.setViewName("login");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterCompletion() 호출");
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterConcurrentHandlingStarted() 호출");
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
}
