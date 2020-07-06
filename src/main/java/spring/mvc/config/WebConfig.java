package spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import spring.mvc.util.ViewNames;

/*
 * ketnakhalasi created on 7/3/20
 * */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "spring.mvc")
public class WebConfig implements WebMvcConfigurer {
    public static final String RESOLVER_PREFIX = "/WEB-INF/view/";
    public static final String RESOLVER_SUFFIX = ".jsp";

    @Bean
    public ViewResolver viewResolver() {

        UrlBasedViewResolver urlViewResolver = new InternalResourceViewResolver();
        urlViewResolver.setPrefix(RESOLVER_PREFIX);
        urlViewResolver.setSuffix(RESOLVER_SUFFIX);

        return urlViewResolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(ViewNames.HOME);
    }
}
