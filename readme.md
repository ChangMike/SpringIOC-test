#### xml方式配置IOC之byName、byType
````
<!-- setter方法注入-->
<bean id="person" class="com.test.spring.Person">
    <property name="car" ref="car"/>
</bean>
<bean id="car" class="com.test.spring.Car" p:color="黑色"/>
````
````
<!-- byType方式注入，不需要写property属性了 -->
<!-- Car的定义可以不提供id="car"，但还是会调用setter方法，setter方法一定要正确 -->
<bean id="person" class="com.test.spring.Person" autowire="byType"/>
<bean class="com.test.spring.Car" p:color="黑色"/>
````
````
<!-- byName方式注入，不需要写property属性了 -->
<bean id="person" class="com.test.spring.Person" autowire="byName"/>
<bean id="car" class="com.test.spring.Car" p:color="黑色"/>
````
