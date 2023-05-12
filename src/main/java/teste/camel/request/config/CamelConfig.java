package teste.camel.request.config;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import teste.camel.request.route.CostumerRouter;

@Configuration
public class CamelConfig {
	
	@Autowired
	private CostumerRouter costumerRouter;

    @Bean
    CamelContext camelContext() throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(costumerRouter);
        return context;
    }

}
