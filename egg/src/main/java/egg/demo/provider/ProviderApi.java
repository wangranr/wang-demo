package egg.demo.provider;

import egg.demo.api.Api;
import com.alibaba.dubbo.config.annotation.Service;


@Service   //dubbo的service，注册dubbo服务
//@Profile("provider")
public class ProviderApi implements Api {

    @Override
    public String sayHello(String name) {
        return "hello world";
    }
}
