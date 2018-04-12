package cn.yejc.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.yejc.interceptor.BaseInterceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{

	@Resource
	private BaseInterceptor baseInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(baseInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
		super.addInterceptors(registry);
	}
}
