package proxy.gxx.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author gxx
 * @create 2021-07-27 21:51
 */
@Configuration
@ComponentScan(basePackages = {"proxy.gxx.spring5.config"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigApp {
}
