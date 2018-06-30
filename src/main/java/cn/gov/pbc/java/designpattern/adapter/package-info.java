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
In enterprise application development, it is likely that you might need to hook in other libraries, APIs, and ��off the shelf�� components, 
and if they are not aligned with the existing system, put the adapter pattern to use. 
After all, being a core GOF pattern, it is a tested and proven solution used over a long period of time.
һЩ����Ա����������ģʽ��һ��ϵͳ����ʱ�޲����������ϵͳû�кܺõ�ȥ���ȥ�����µĿ����ԡ�����˵����һ���̶�������ȷ�ģ��������ǲ�������һ���������пɲ�μܹ���ҵ����Ӧ�ã����ʱ���ǵ����н����������ӵ������
����ҵ��Ӧ�ÿ����У��ܿ�������Ҫ���������Ŀ⣬API���ֳɵ������������ǲ������ִ��ϵͳ���ܽ�ϣ�����ʹ��������ģʽ��
�Ͼ���Ϊһ�����ĵ�GOFģʽ���ܳ�ʱ����֤��������һ�����ܿ���Ľ��������
Adapter Pattern in the Spring Framework
When doing Enterprise Application Development with the Spring Framework, you will be using adapters built into the framework. 
Spring Integration uses JMS adapters to send and receive JMS messages and JDBC adapters to convert messages to database queries and result sets back to messages.
Spring also uses the adapter design pattern to handle load-time-weaving used in Aspect-Oriented Programming (AOP). 
An adapter is used to inject AspectJ��s aspects to bytecode during class loading done by the servlet container.
��ʱ��Spring��ܽ�����ҵӦ�ÿ���ʱ�������ʹ����������ϵ�����С�Spring����ʹ��Jms Adapter�����ͺͽ���Jms��Ϣ��ʹ��JDBC Adapter��ת����ϢΪ���ݿ��ѯȻ��ѽ�������ص���Ϣ��
Spring��AOP��Ҳʹ�����������ģʽ������[load-time waving]��������������ע��AspectJ��s ���浽�ֽ���������ص�ʱ��ͨ��servlet������
 */
package cn.gov.pbc.java.designpattern.adapter;