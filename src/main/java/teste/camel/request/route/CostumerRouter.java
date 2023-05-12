package teste.camel.request.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CostumerRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
						
		// TODO Auto-generated method stub
		
		from("direct:postRequest")
		.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
		.setHeader(Exchange.HTTP_METHOD, constant("POST"))
		.to("http://localhost:8081/ws")
		.log("Response: ${body}");
		
	}
	
}


