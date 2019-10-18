package egg.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import egg.demo.api.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service    //注册bean到spring容器中
@Profile("consumer")
public class ConsumerService {   //拿到去注册中心的服务
    private Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);

    @Reference(interfaceClass = egg.demo.api.Api.class)   //远程引用指定的服务，会按照全类名进行匹配，看谁给这个注册中心注册了这个全类名
    private Api api;
     
    public void  hello(){
        String hello = api.sayHello("hello world!");
        LOGGER.info("helloresult:{}",hello);
        System.out.println(hello);
    }
}
