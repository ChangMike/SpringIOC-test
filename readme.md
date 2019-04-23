#### xml方式配置IOC
1. 控制反转
- 在bean标签里使用constructor-arg属性使用有参的构造方法实例化bean
- 在bean标签里不使用constructor-arg时会使用无参的构造方法实例化bean
---
2. 依赖注入
- 构造器注入，在bean标签里使用constructor-arg属性为bean注入属性
- setter方法注入，在bean标签里使用property属性为bean注入属性
