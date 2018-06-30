/**
Participants of the Adapter Pattern
To understand how the adapter pattern works, consider an existing text formatting application comprising of a TextFormattable interface and a NewLineFormatter implementation class. 
A client provides a string to format with a call to the formatText(String text) method declared in the interface. 
The implementation class returns a new string by replacing the periods with new line characters.

As an enhancement, the application now needs to support CSV formatting so that the text can be read and edited in a spreadsheet software. 
The new feature has been implemented and delivered by an external vendor as a CsvFormattable interface along with a CsvFormatter implementation class.

To integrate the new feature in the existing application, several issues require addressing. 
Primarily, the interface against which the new requirements are implemented has a different structure with different methods, and this is not what the clients of the application expect.

One approach to address such incompatibilities is to ask the vendor to supply a new version with a compatible interface. 
Another is to update the structure of the existing interface to accommodate the new requirement. 
Both the approaches will not only result in major rework but also carry the risk of violating the SOLID programming principles, specifically Single Responsibility Principle and Interface Segregation Principle. In such situations, the adapter pattern comes to the rescue.

Using the adapter pattern, you can create a class, say CsvAdapterImpl that will act as an adapter to make both the incompatible interfaces (TextFormattable and CsvFormattable) work together.

There are two variants of adapters: Object adapter that relies on composition and class adapter that relies on inheritance. 
As Java does not support multiple inheritance, you have to use object adapter when there are multiple classes that the adapter needs to address. 
Also, the approach to favors composition over inheritance should be the driving factor for using object adapters in Java.

We can summarize the participants of the adapter pattern in the context of the text formatting example, as:

Target (TextFormattable): The existing interface that clients communicate with.
Adaptee (CsvFormattable): The new incompatible interface that needs adapting.
Adapter (CsvAdapterImpl): A class that adapts the Adaptee to the Target.
Client: Communicates with the Target.


Conclusion
Some programmers argue that the Adapter pattern is a workaround for a system, which was not well designed keeping into considerations new possibilities. 
While this is true to some extent, we cannot expect an enterprise application, 
which will often have a pluggable architecture, to be designed considering all components that might get added in future.
In enterprise application development, it is likely that you might need to hook in other libraries, APIs, and “off the shelf” components, 
and if they are not aligned with the existing system, put the adapter pattern to use. 
After all, being a core GOF pattern, it is a tested and proven solution used over a long period of time.
一些程序员争论适配器模式是一个系统的临时修补方案，这个系统没有很好的去设计去考虑新的可能性。这中说法在一定程度上是正确的，但是我们不能期望一个经常会有可插拔架构企业级的应用，设计时考虑到所有将来可能增加的组件。
在企业级应用开发中，很可能你需要引用其他的库，API和现成的组件。如果他们不想与现存的系统紧密结合，可以使用适配器模式。
毕竟作为一个核心的GOF模式，很长时期内证明了这是一个经受考验的解决方案。
Adapter Pattern in the Spring Framework
When doing Enterprise Application Development with the Spring Framework, you will be using adapters built into the framework. 
Spring Integration uses JMS adapters to send and receive JMS messages and JDBC adapters to convert messages to database queries and result sets back to messages.
Spring also uses the adapter design pattern to handle load-time-weaving used in Aspect-Oriented Programming (AOP). 
An adapter is used to inject AspectJ’s aspects to bytecode during class loading done by the servlet container.
当时用Spring框架进行企业应用开发时，你可以使用适配器组合到框架中。Spring集成使用Jms Adapter来发送和接受Jms消息，使用JDBC Adapter来转化消息为数据库查询然后把结果集返回到消息。
Spring在AOP中也使用适配器设计模式来处理[load-time waving]。适配器被用来注入AspectJ’s 切面到字节码在类加载的时候通过servlet容器。
 */
package cn.gov.pbc.java.designpattern.adapter;