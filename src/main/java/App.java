import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1.getMessage());

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.getName());

        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean1.getName());

        System.out.println("Bean equals bean1 ? - " + (bean == bean1));
        System.out.println("CatBean equals catBean1 ? - " + (catBean == catBean1));

    }
}