package cn.how2j.springcloud.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cn.how2j.springcloud.pojo.Product;

@Component
//bean（把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

	public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}