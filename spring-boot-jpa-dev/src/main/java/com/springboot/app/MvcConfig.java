package com.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@Configuration
public class MvcConfig  extends WebMvcConfigurerAdapter {

     /**
      private final Logger log = LoggerFactory.getLogger(getClass());
      @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
      super.addResourceHandlers(registry);

      String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();
      log.info(resourcePath);
      registry.addResourceHandler("/uploads/**")
      .addResourceLocations(resourcePath);
      }

      **/

}
