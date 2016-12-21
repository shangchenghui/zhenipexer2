package hello;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	private static Logger logger = Logger.getLogger(SampleController.class);

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!你好！！！！！";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
        logger.info("============= SpringBoot Exer Start Success !!!!=============");
    }
}