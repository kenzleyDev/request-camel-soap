package teste.camel.request.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teste")
public class CostumerController {
	
    @Autowired
    private ProducerTemplate producerTemplate;
    
    
    @PostMapping("/soap")
    public void makePostRequest(@RequestBody String requestBody) {
        producerTemplate.sendBody("direct:postRequest", requestBody);
    }

}
