//package com.qdc.demoeurekaprovider1.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
//
//@Configuration
//public class Oauth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
//    private static final String URL="http://localhost:8081/oauth/check_token";
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        //设置验证Token的方法，即使用test1和123456的客户端身份去URL验证token
//        //远程Token服务
//        RemoteTokenServices tokenServices = new RemoteTokenServices();
//        tokenServices.setCheckTokenEndpointUrl(URL);
//        tokenServices.setClientId("test");
//        tokenServices.setClientSecret("123456");
//
//        resources.tokenServices(tokenServices);
//        //设置当前的资源服务器的resource_id为userall，注意当前Clientid是否拥有对resourceid的访问权限
//        resources.resourceId("userall").stateless(true);
//    }
//
//
//}
