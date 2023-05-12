package teste.camel.request;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RequestApplication {
	
    @Autowired
    private CamelContext camelContext;

	public static void main(String[] args) {
		SpringApplication.run(RequestApplication.class, args);
	}
	

    @PostConstruct
    public void init() throws Exception {
        camelContext.start();
    }

    @PreDestroy
    public void destroy() throws Exception {
        camelContext.stop();
    }

}
