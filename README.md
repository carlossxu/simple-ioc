# simple-ioc
simple spring ioc implementation

| FileName         | Description                                                  |
| ---------------- | ------------------------------------------------------------ |
| beans.properties | 要注册的bean信息                                             |
| BeanDefinition   | bean信息实体类                                               |
| BeanRegister     | 使用HashMap存储已经创建好的bean，当做单例缓存使用            |
| ResourceLoader   | 加载当前目录下的beans.properties信息                         |
| BeanFactory      | bean实体的生产工厂，为用户提供bean的实例                     |
| UserDao          | 这里设置一个用户类，来测试ioc实际运行情况                        |
| ApiTest          | 测试类，测试是否能正常生成bean实例，并且多次get到的bean是否是同一个实例 |
