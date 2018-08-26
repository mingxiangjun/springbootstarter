# springbootstarter
Springboot starter demo
版本信息:
  springboot version:1.5.9.RELEASE
  springboot aop starter：1.5.9.RELEASE
 
使用插件：<br/>
<pre>  lombok：1.18.0</pre>

工程结构：<br/>
<pre>springbootstarter：父工程
    rest :引入starter，测试使用。包含controller、service、mybatis等信息
    starter：starter demo。实现内容，引入aop切面类，实现参数对调用方的aop切入
</pre>
