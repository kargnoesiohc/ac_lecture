package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("myInterceptor")
public class MyHandlerInterceptor extends HandlerInterceptorAdapter{  //HandlerInterceptorAdapter클래스 상속 받아야 함
	//main, home에 대한 요청만 interceptor
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle() 호출");
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) { //xml에서 특정 주소에 대한 요청만 처리함. 그래서 loginForm에대한 처리는 안함
			System.out.println("로그인 정보 없음");
			response.sendRedirect("login");
		}
		return super.preHandle(request, response, handler);
		//return true : 이후 작업 실행 O
		//return false : 이후 작업 실행 X
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandle() 호출");
		super.postHandle(request, response, handler, modelAndView);
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
