package cn.soboys.springbootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan({"cn.soboys.springbootmybatisplus.mapper"})
public class SpringbootMybatisplusApplication {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(SpringbootMybatisplusApplication.class, args);
        //displayAllBeans();
    }

    /**
     * 打印所以装载的bean
     */
    public static void displayAllBeans() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
}
