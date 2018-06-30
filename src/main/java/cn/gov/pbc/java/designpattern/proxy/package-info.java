/**
 *Conclusion
 *You may have observed that many patterns in the GoF structural family are about “wrapping” a class, but with variations. 
 *They are structurally very similar, if not identical. 
 *What makes the Proxy Pattern distinct is that it has the same interface as the real object. 
 *So if you are working on a system and feel the need to introduce a proxy either to instantiate a real object on demand, 
 *or hide the fact that the object is running on a remote location, or control access to the object,you can easily do so. 
 *You don’t need to worry about the client being aware about any changes from the introduction of the proxy. 
 *The client will keep using the same interface thinking it is interacting with the real object, 
 *while the proxy will be mediating in between.
 *你可能注意到了在GOF结构性设计模式中许多模式是关于“封装”一个类，但是也跟随着变化。 他们在结构上非常相似但是也不完全相同。
 *使代理模式不同的是作为一个实体它有相同的接口。
 *所以如果你在开发一个系统，并且感觉需要引入代理-在需要的时候实例化一个真实对象，或者隐藏对象在远程位置正在运行的真相，或者控制访问对象的权限，你可以很容易的这么做。
 *你不用担心客户端意识到关于代理介绍的任何更改。客户端始终保持使用同一个接口来考虑与实际对象的交互，而代理担当者他们之间的中介。
 *
 *While developing Enterprise Applications with the Spring Framework, 
 *you will find lots of opportunities to apply the Proxy pattern or see it naturally at work within the framework APIs. 
 *This pattern is particularly used heavily in Spring AOP. 
 *As an example, In Spring AOP you create proxies of the objects that handle the cross cutting concern code. 
 *The Proxy pattern also forms the core foundation of remoting technologies that Spring supports, such as RMI, Spring’s HTTP Invoker, Hessian, and Burlap. 
 *Through the use of a proxy, the upstream software is unaware it is using a remoting technology. 
 *And when coupled with dependency injection in Spring, you could easily run all locally for development tasks, 
 *while using a remoting proxy once deployed to the production environment.
 *
 *当使用spring开发企业应用程序时，你会发现很多使用代理模式的机会或者在使用framework APIs时自然的就看到了。代理模式在Spring AOP中有大量具体的使用。
 *举一个例子，在Spring AOP中你创建对象的代理来处理切面的有关代码。 代理模式也形成了远程技术的核心基础，例如RMI、Spring’s HTTP Invoker, Hessian, and Burlap. 
 *通过代理的使用,上游软件不知道是使用远程技术。 当我们与Spring 依赖注入结合使用，你可以在本地很容易的运行所有的开发任务，而一旦部署到生产环境后可以使用远程代理。
 */
package cn.gov.pbc.java.designpattern.proxy;