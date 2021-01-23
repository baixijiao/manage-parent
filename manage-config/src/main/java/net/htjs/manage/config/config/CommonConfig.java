package net.htjs.manage.config.config;

import net.htjs.manage.config.config.beans.TerminateBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: baixijiao
 * @Date：2021-01-23 09:07
 * @Description： 配置服务端服相关bean配置
 * @Modified By:
 */
@Configuration
public class CommonConfig {

    // 服务停止的bean
    @Bean
    public TerminateBean getTerminateBean() {
        return new TerminateBean();
    }

}
