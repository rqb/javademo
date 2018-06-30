/**
 *Conclusion
 *You may have observed that many patterns in the GoF structural family are about ��wrapping�� a class, but with variations. 
 *They are structurally very similar, if not identical. 
 *What makes the Proxy Pattern distinct is that it has the same interface as the real object. 
 *So if you are working on a system and feel the need to introduce a proxy either to instantiate a real object on demand, 
 *or hide the fact that the object is running on a remote location, or control access to the object,you can easily do so. 
 *You don��t need to worry about the client being aware about any changes from the introduction of the proxy. 
 *The client will keep using the same interface thinking it is interacting with the real object, 
 *while the proxy will be mediating in between.
 *�����ע�⵽����GOF�ṹ�����ģʽ�����ģʽ�ǹ��ڡ���װ��һ���࣬����Ҳ�����ű仯�� �����ڽṹ�Ϸǳ����Ƶ���Ҳ����ȫ��ͬ��
 *ʹ����ģʽ��ͬ������Ϊһ��ʵ��������ͬ�Ľӿڡ�
 *����������ڿ���һ��ϵͳ�����Ҹо���Ҫ�������-����Ҫ��ʱ��ʵ����һ����ʵ���󣬻������ض�����Զ��λ���������е����࣬���߿��Ʒ��ʶ����Ȩ�ޣ�����Ժ����׵���ô����
 *�㲻�õ��Ŀͻ�����ʶ�����ڴ�����ܵ��κθ��ġ��ͻ���ʼ�ձ���ʹ��ͬһ���ӿ���������ʵ�ʶ���Ľ�������������������֮����н顣
 *
 *While developing Enterprise Applications with the Spring Framework, 
 *you will find lots of opportunities to apply the Proxy pattern or see it naturally at work within the framework APIs. 
 *This pattern is particularly used heavily in Spring AOP. 
 *As an example, In Spring AOP you create proxies of the objects that handle the cross cutting concern code. 
 *The Proxy pattern also forms the core foundation of remoting technologies that Spring supports, such as RMI, Spring��s HTTP Invoker, Hessian, and Burlap. 
 *Through the use of a proxy, the upstream software is unaware it is using a remoting technology. 
 *And when coupled with dependency injection in Spring, you could easily run all locally for development tasks, 
 *while using a remoting proxy once deployed to the production environment.
 *
 *��ʹ��spring������ҵӦ�ó���ʱ����ᷢ�ֺܶ�ʹ�ô���ģʽ�Ļ��������ʹ��framework APIsʱ��Ȼ�ľͿ����ˡ�����ģʽ��Spring AOP���д��������ʹ�á�
 *��һ�����ӣ���Spring AOP���㴴������Ĵ���������������йش��롣 ����ģʽҲ�γ���Զ�̼����ĺ��Ļ���������RMI��Spring��s HTTP Invoker, Hessian, and Burlap. 
 *ͨ�������ʹ��,���������֪����ʹ��Զ�̼����� ��������Spring ����ע����ʹ�ã�������ڱ��غ����׵��������еĿ������񣬶�һ�������������������ʹ��Զ�̴���
 */
package cn.gov.pbc.java.designpattern.proxy;