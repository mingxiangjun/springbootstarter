# springbootstarter
Springboot starter demo
<pre>版本信息:
  springboot version:1.5.9.RELEASE
  springboot aop starter：1.5.9.RELEASE
</pre> 
使用插件：<br/>
<pre>  lombok：1.18.0</pre>

工程结构：<br/>
<pre>springbootstarter：父工程
    rest :引入starter，测试使用。包含controller、service、mybatis等信息
    starter：starter demo。实现内容，引入aop切面类，实现参数对调用方的aop切入
</pre>

starter工程创建说明：
<pre>
    如果想要创建自定义的starter工程，其他的配置项与正常的工程相差无几，都是需要以下几个步骤：
        1、创建maven工程
        2、添加pom依赖，添加parent指向spring-boot-dependencies，也就是通常的springboot工程的parent。如果已经有自己的父子结构了，则可以通过配置以下依赖完成：
            &lt;dependencyManagement&gt;
                &lt;dependencies&gt;
                    &lt;dependency&gt;
                        &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
                        &lt;artifactId&gt;spring-boot-dependencies&lt;/artifactId&gt;
                        &lt;version&gt;1.5.9.RELEASE&lt;/version&gt;
                        &lt;type&gt;pom&lt;/type&gt;
                        &lt;scope&gt;import&lt;/scope&gt;
                    &lt;/dependency&gt;
                &lt;/dependencies&gt;
            &lt;/dependencyManagement&gt;
        3、创建对应的autoConfigure类
        4、在resources目录下创建目录：META-INF，在此目录下创建spring.factories文件。添加对应配置：
            org.springframework.boot.autoconfigure.EnableAutoConfiguration=你的自动配置文件，如本工程中的MyAutoconfigure
</pre>