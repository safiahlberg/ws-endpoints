package com.wixia.endpoints;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    /**
     * Exposes the ServiceOne WSDL on
     * <a href="/ws/ServiceOne.wsdl">/ws/ServiceOne.wsdl</a>
     *
     * @return the WSDL definition
     */
    @Bean(name = "ServiceOne")
    public Wsdl11Definition serviceOneWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition(
                new ClassPathResource("/wsdl/ServiceOne.wsdl"));
        return wsdl11Definition;
    }

    /**
     * Exposes the ServiceTwo WSDL on
     * <a href="/ws/ServiceTwo.wsdl">/ws/ServiceTwo.wsdl</a>
     *
     * @return the WSDL definition
     */
    @Bean(name = "ServiceTwo")
    public Wsdl11Definition serviceTwoWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition(
                new ClassPathResource("/wsdl/ServiceTwo.wsdl"));
        return wsdl11Definition;
    }

}
