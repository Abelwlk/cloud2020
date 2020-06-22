package wlk.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置feign日志信息增强
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        //return Logger.Level.NONE;默认的，不显示任何日志
        //return Logger.Level.BASIC;仅记录请求方法、URL、响应状态码及执行时间
        //return Logger.Level.HEADERS;除了BASIC中定义的信息之外，还有请求和响应信息
        return Logger.Level.FULL;//除了HEADERS中定义的信息之外，还有请求和响应的正文元数据
    }
}
