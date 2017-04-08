package application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by ud on 8/4/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(value = "application")
public class AppConfig {
}
