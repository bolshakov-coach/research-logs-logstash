package pro.bolshakov.research.logslogstash.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MainController {

    private final static Logger logger = LoggerFactory.getLogger(MainController.class);

    @PostMapping("/test")
    public void index(){
        logger.info("test log with UUID " + UUID.randomUUID());
    }

}
