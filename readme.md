#### xml方式配置IOC
1. 控制反转
- 在bean标签里使用constructor-arg属性使用有参的构造方法实例化bean
  1. id和name
   - id的命名需要满足XML对id的命名规范，必须以字母开头
   - name属性几乎可以使用任何特殊字符
   - 如果id和name都没有指定，自动将全限定类名作为bean的名称
   - 如果有多个name相同的bean，使用getBean(beanName)获取Bean时，将返回后面声明的那个bean。所以为了避免无意间的覆盖，应尽量使用id
<details>
<summary>入参顺序</summary>

- 通过type声明的入参，位置是无序的，即声明参数的顺序和构造方法参数的顺序无关
- 需要确定顺序时，可以使用index   
`<constructor-arg index="0" value="xxx"/>
<constructor-arg index="1" value="yyy"/>`
</details>

  
- 在bean标签里不使用constructor-arg时会使用无参的构造方法实例化bean
---
2. 依赖注入
- 构造器注入，在bean标签里使用constructor-arg属性为bean注入属性
   - 循环依赖，如果两个bean在构造函数中互相依赖对方，spring容器将无法启动
- setter方法注入，在bean标签里使用property属性为bean注入属性
   - spring只会检查bean中是否有对应的setter方法，对于bean中是否有对应的成员变量不做要求
   - spring要求setter方法要满足Sun JavaBean的命名规范。Java的属性名以小写字母开头，或前两个字母都大写，或前两个字母都小写


