import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat catOne = applicationContext.getBean("getCat", Cat.class);
        Cat catTwo = applicationContext.getBean("getCat", Cat.class);

        System.out.println("Бины Hello World ссылаются на один и тот же объект " + (bean==bean1));
        System.out.println("Бины Cat ссылаются на один и тот же объект " + (catOne==catTwo));
    }
}