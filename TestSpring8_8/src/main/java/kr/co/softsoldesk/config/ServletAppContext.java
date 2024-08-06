package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer {
	//WebMvcConfigurer : Spring MVC 프로젝트 설정 인터페이스

   @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
   //Controller의 메서드가 반환하는 jsp의 이름 앞 뒤에 경로와 확장자를 붙여주는 메서드
      WebMvcConfigurer.super.configureViewResolvers(registry);
      registry.jsp("/WEB-INF/views/" , ".jsp");
   
   }
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
	   WebMvcConfigurer.super.addResourceHandlers(registry);
	   registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/resources");
   }
   
   
}
