import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    // 注册好的Bean信息
    private Map<String, BeanDefinition> beanDefinitionMap;

    // 对象单例缓存
    private BeanRegister beanRegister;

    public BeanFactory() {
        beanDefinitionMap = ResourceLoader.getResource();
        beanRegister = new BeanRegister();
    }

    public Object getBean(String beanName) {
        Object bean = beanRegister.getSingletonBean(beanName);
        if (bean != null) {
            return bean;
        }
        return createBean(beanDefinitionMap.get(beanName));
    }

    private Object createBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            beanRegister.registerSingletonBean(beanDefinition.getBeanName(), bean);
            return bean;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
