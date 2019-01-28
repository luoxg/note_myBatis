package com.onyx.note.conf;

import com.alibaba.fastjson.JSONObject;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * mvc配置
 * @author lxg
 * 2018年1月10日
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Override  
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") 
                .allowedHeaders("*")
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS", "HEAD")
                .maxAge(3600);  
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RepeatedlyReadInterceptor()).addPathPatterns("/user/**");
        super.addInterceptors(registry);
    }

    @Bean
    public FilterRegistrationBean repeatedlyReadFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        RepeatedlyReadFilter repeatedlyReadFilter = new RepeatedlyReadFilter();
        registration.setFilter(repeatedlyReadFilter);
        registration.addUrlPatterns("/user/*");
        return registration;
    }

    /**
     * 加载 StringDateJSONObject Bean
     */
    @Bean
    public Converter<String, JSONObject> jsonStringToJSONObjectConverter() {
        return new Converter<String, JSONObject>() {
			@Override
			public JSONObject convert(String jsonString) {
				if (StringUtils.isBlank(jsonString)) {
		            return null;
		        }
		        return JSONObject.parseObject(jsonString);
			}
		};
    }
}
