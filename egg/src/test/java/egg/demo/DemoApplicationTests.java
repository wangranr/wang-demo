package egg.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import egg.demo.consumer.ConsumerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("consumer")
public class DemoApplicationTests {
    @Resource       //用resource引用，引用的是容器里的bean，而不是RPC
            ConsumerService consumerservice;
    @Test
    public void contextLoads() {
        consumerservice.hello();
    }

}
