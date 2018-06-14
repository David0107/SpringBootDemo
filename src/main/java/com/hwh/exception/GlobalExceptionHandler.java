package com.hwh.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	public static final String DEFAULT_404_VIEW="error/404";
	public static final String DEFAULT_500_VIEW="error/500";
	 
	@ExceptionHandler(value = Exception.class)
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
			Exception exception) {
		ModelAndView mv=new ModelAndView();
		String requestType = request.getHeader("X-Requested-With");
		if (StringUtils.isEmpty(requestType)) {
			 if (exception instanceof org.springframework.web.servlet.NoHandlerFoundException) {				
				 mv.setViewName(DEFAULT_404_VIEW);
				 return mv;
			  }
			 System.out.println("---500---异常："+exception);
		     mv.setViewName(DEFAULT_500_VIEW);
			return mv;
		} else {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json; charset=utf-8");
			try {
				response.getWriter().write("系统异常");
				response.getWriter().flush();
				return null;
			} catch (IOException e) {

			}
		}
		return null;
	}
}
