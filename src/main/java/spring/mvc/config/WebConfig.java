package spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/*
 * ketnakhalasi created on 7/3/20
 * */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "spring.mvc")
public class WebConfig {
    public static final String RESOLVER_PREFIX = "/WEB-INF/view/";
    public static final String RESOLVER_SUFFIX = ".jsp";

    @Bean
    public ViewResolver viewResolver() {

        UrlBasedViewResolver urlViewResolver = new InternalResourceViewResolver();
        urlViewResolver.setPrefix(RESOLVER_PREFIX);
        urlViewResolver.setSuffix(RESOLVER_SUFFIX);

        return urlViewResolver;
    }
}
