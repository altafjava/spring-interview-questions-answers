### Spring Interview Questions & Answers

> Click :star: if you like the project. Pull Request is highly appreciated. Follow me [@AltafJava](https://twitter.com/altafjava) for technical updates.

![Spring-Logo](images/spring-logo.png)

## Table of Contents

| No. | Questions                                                                                                                                                             |
| --- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|     | **Spring Core**                                                                                                                                                       |
| 1   | [What is Spring Framework?](#What-is-Spring-Framework)                                                                                                                |
| 2   | [What is open source?](#What-is-open-source)                                                                                                                          |
| 3   | [What is an application framework?](#What-is-an-application-framework)                                                                                                |
| 4   | [How is Spring lightweight?](#How-is-Spring-lightweight)                                                                                                              |
| 5   | [What is Inversion of Control (IoC)?](#What-is-Inversion-of-Control-IoC)                                                                                              |
| 6   | [What is an aspect-oriented container framework?](#What-is-an-aspect-oriented-container-framework)                                                                    |
| 7   | [What are the features of Spring Framework?](#What-are-the-features-of-Spring-Framework)                                                                              |
| 8   | [What are the differences between Spring & Struts?](#What-are-the-differences-between-Spring--Struts)                                                                 |
| 9   | [What is Java EE?](#What-is-Java-EE)                                                                                                                                  |
| 10  | [What are the limitations of Java EE (API)?](#What-are-the-limitations-of-Java-EE-API)                                                                                |
| 11  | [What is Boilerplate code? What are the problems if we write the boilerplate code?](#What-is-Boilerplate-code-What-are-the-problems-if-we-write-the-boilerplate-code) |
| 12  | [Can we say Spring is the replacement of Java EE?](#Can-we-say-Spring-is-the-replacement-of-Java-EE)                                                                  |

## Spring Core

1. ### What is Spring Framework?

   Spring Framework is an open source application framework. We can also say that it is a lightweight inversion of control(IoC) container and aspect-oriented container framework for the Java platform. Spring handles the infrastructure so that we can focus on our application development. It was created by Rod Johnson. In 2003 Spring came into existence.

   <div align="right">
       <b><a href="#table-of-contents">⬆ Back to Top</a></b>
   </div>

2. ### What is open source?

   Open source simply means the source code that anyone can see, inspect, modify, and enhance. If you want you can also contribute to [spring-framework](https://github.com/spring-projects/spring-framework).

   <div align="right">
     <b><a href="#table-of-contents">⬆ Back to Top</a></b>
   </div>

3. ### What is an application framework?

   An application framework is a software library that provides a fundamental structure to support the development of applications for a specific environment. An application framework acts as the skeletal support to build an application. The intention of designing application frameworks is to lessen the general issues faced during the development of applications.

   <div align="right">
     <b><a href="#table-of-contents">⬆ Back to Top</a></b>
   </div>

4. ### How is Spring lightweight?

   Spring is considered lightweight compared to traditional Java EE applications. If we want to run a Java EE application, we can't just create a small application that will run on its own. We shall need a Java EE application server to run our application such as Glassfish, Wildfly, WebLogic, Websphere etc. Most application servers are big and complex pieces of software, that are not trivial to install or configure. Hence If we use Spring then we won't need such things.

   Secondly, Spring provides various modules for different purposes. These modules are grouped into Core Container, Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation, Messaging, and Test, as shown in the following diagram. To use one or part of the module we don't need to inject all the modules. For example, we can use Spring JDBC without Spring Web.

   ![spring-framework-runtime](images/core/spring-framework-runtime.png)

   <div align="right">
     <b><a href="#table-of-contents">⬆ Back to Top</a></b>
   </div>

5. ### What is Inversion of Control (IoC)?

   Inversion of Control is a principle in Software Engineering by which the control of objects or portions of a program is transferred to a container or framework.

   For example, say our application has a text editor component and we want to provide spell checking. Our standard code would look something like this:

   ```
   public class TextEditor {

     private SpellChecker checker = new SpellChecker();

   }
   ```

   Here TextEditor needs a SpellChecker object. Means TextEditor is dependent on SpellChecker and we are manually instantiating the TextEditor object. Means we are managing the dependency. Means we have the control. Now look at the below code:

   ```
   public class TextEditor {

    private SpellChecker checker;

    public TextEditor(SpellChecker checker) {
        this.checker = checker;
    }
   }
   ```

   Here we are asking the Spring to instantiate the SpellChecker object and pass in the constructor of TextEditor i.e. Constructor Injection. Means Spring is managing the dependency. Now the control is transferred from Programmer to Spring. This is nothing but Inversion of Control.

  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>

6. ### What is an aspect-oriented container framework?

   In computing, aspect-oriented programming (AOP) is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns. In simple words we can say that it is a methodology which will separate cross-cutting concerns from core concerns. For example, if writing an application for handling medical records, the indexing of such records is a core concern, while logging a history of changes to the record database or user database, or an authentication system, would be cross-cutting concerns.

   **Core concern:** The logic that seems to be mandatory and without having that logic the existence of our application will not be there, such kind of logic is considered as core concern. Ex: writing business logic, fetching data from database/external API etc.

   **Cross-Cutting concern:** The program logic which is common across the application and the presence/absence of that logic does not impact core business functionality but if we apply the cross-cutting logic then it affects multiple points of an application is nothing but cross-cutting logic. Ex: Logging, Caching, Transaction processing, Security etc.

   ![cross-cutting-concerns](images/core/cross-cutting-concerns.png)

   The above figure represents a typical application that’s broken down into modules. Each module’s main concern is to provide services for its particular domain. But each module also requires similar ancillary functionalities, such as security, logging & transaction management.

   Spring has provided rich support for aspect-oriented programming in its AOP module. Hence we can say that Spring is an aspect-oriented container framework.

  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>

7. ### What are the features of Spring Framework?

   - **Versatile:** Spring can be called as a framework of frameworks because it provides support to various other frameworks such as Struts, Hibernate, Tapestry, EJB, JSF etc. If we want to use Spring in the existing application we can use it without removing the existing technology and don't need to rewrite the code for existing functionality that is nothing but Versatile application development.

     Prior to Spring, Struts was so popular in the market. Almost every company was using the Struts. Now Spring says let the existing investments(code/technology) be in the same way. We don't demand you to modify any of your existing investments. In addition to the existing investments you have, start adding the Spring framework into your project. Spring is versatile & flexible in such a way, it can dissolve into your existing project and can make your project more richer, much better & much stronger than earlier one.

   - **Non-Invasive:** We don't need to extend/implement any Spring provided class/interface to our classes. So whenever we want we can change Spring framework to any other framework. In this case no need to change the logic of our classes.

   - **Lightweight:** Actually Spring is a vast framework but Spring people divided the whole framework into different modules. They are designed in such a way that no module is dependent on other modules except the Spring Core module. Hence according to our requirement we can learn/use a particular module. We don't need to learn the whole framework to use the part of it. Example: We can use Spring ORM module without Spring Web module.

   - **Dependency Injection:** The process of injecting the dependent object into the target object is nothing but dependency injection. Let's take an example: There is an Employee class. It requires an Address object. Means Employee class is a target object & the Address is class dependent.

     ```
     @Component
     class Employee {
       private int id;
       private String name;
       private Address address;

       Employee() {
         id = 10;
         name="David";
         address = new Address();
       }
     }
     ```

     ```
     @Component
     class Address {
       private String street;
       private String city;

       Address() {
         street="Wall Street";
         city="New York";
       }
     }
     ```

     In the above code, Spring is creating both the objects(Employee & Address) and injecting the address object into Employee class constructor.

     There are 3 types of Dependency Injection:

     - Constructor Injection: Dependencies are provided as constructor parameters. Ex: Spring, Pico container etc
     - Setter Injection: Dependencies are assigned through setter methods. Ex: Spring
     - Interface Injection: Injection is done through an interface. Ex: Avalon, but Avalon has been closed now

     **Note:** Spring supports only Constructor and Setter Injection.

   - **IOC Container:** Spring has provided a container which is responsible for collaborating objects & managing the lifecycle of objects. There are two ways for collaborating objects.

     1. Dependency Pulling

        - Dependency Lookup
        - Contextual Dependency Lookup

     2. Dependency Injection

        - Setter Injection
        - Constructor Injection

   - **AOP:** Aspect-Oriented Programming(AOP) is used for separating cross-cutting concerns (logging, caching, security, etc) from the business logic of the application. For more info [Read this...](#What-is-an-aspect-oriented-container-framework)

   - **MVC Framework:** Used to create web applications or RESTful web services, capable of returning responses in different formats like json,xml etc.

   - **Transaction Management:** Spring framework provides a generic Transaction Management layer which can be used with or without J2EE(JEE) environment. It provides an interface that can scale down to a local transaction and scale up to global transactions (using JTA).

   - **Secure:** Spring has provided a separate module for securing the application. Spring Security is a Java SE/Java EE security framework to provide Authentication, Authorization, SSO and other Security features for Web Applications or Enterprise Applications. Spring Security supports the various types of security such as :

     - Authentication and Authorization.
     - BASIC,Digest and Form-Based Authentication.
     - LDAP Authentication.
     - OpenID Authentication.
     - SSO (Single Sign-On) Implementation.
     - Cross-Site Request Forgery (CSRF) Implementation.
     - "Remember-Me" Feature through HTTP Cookies.
     - Implementation of ACLs.
     - "Channel Security" that means automatically switching between HTTP and HTTPS.
     - JAAS (Java Authentication and Authorization Service).
     - Flow Authorization using Spring WebFlow Framework.
     - WS-Security using Spring Web Services.

   - **Layered Architecture:** Spring framework is a layered architecture which consists of several modules. All modules are built on the top of its core module. These modules provide everything that a developer may need for use in enterprise application development. A developer is always free to choose what features he/she needs and eliminate the modules which are of no use. It's modular architecture enables integration with other frameworks without much hassle.

   - **Exception Handling:** Spring provides a convenient API for translating technology-specific exceptions into unchecked exceptions.

   - **Easy Integration:** Spring is designed to be used with other frameworks as well. We can use ORM, Struts, Hibernate and other frameworks together with Spring. Spring framework does not impose any restriction on the frameworks to be used together.

   - **End to end development:** Spring can be used for development of different kinds of applications like standalone applications, Web applications and applets as well.

  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>

8. ### What are the differences between Spring & Struts?

   Struts framework supports only developing web applications but spring framework supports various types of application development. In a web application not only have web related aspects, but can have various other things like managing business logic, persisting data, transaction management, messaging, calling external web-services etc. In this case Struts not able to serve these aspects but using Spring we can develop JSE, JEE, Remote(RMI), Persistency, Distributed applications etc.

   Technical Differences between Spring & Struts:
   | Spring | Struts |
   | --------------------------- | ---------------------------- |
   | Spring is an application framework which implements both MVC & IOC design pattern.| Struts is a web framework which implements only MVC design pattern. |
   | Spring is a layered architecture. | Struts is a not a layered architecture. |
   | Spring provides abstraction layer on multiple Java technologies including Servlet, JSPs as well as on other framework software like Hibernate, Tapestry, EJB, JSF etc. | Struts provides abstraction layer only on Servlet, JSP technology. |
   | Spring is a lightweight framework which is loosely coupled. | Struts is a heavyweight framework which is tightly coupled. |
   | Spring provides easy integration with ORM, JDBC technologies. | Struts does not provide support for integrating with ORM, JDBC technology. Manually we need to write code. |
   | Spring is non-invasive which means it doesn’t force a programmer to extend/implement their class from any predefined class or interface given by Spring API. | Struts is invasive. Means it forces the programmer to extend the base class provided by Struts API. |
   |Spring allows JSP, Velocity, Free maker, Excel and PDF for view components. |Struts allows only JSP as view components.|

  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>

9. ### What is Java EE?

   Java EE is an api/specification. Anyone is open to develop and provide a working implementation of the specification. The concrete implementations are the so-called application servers like WildFly, TomEE, GlassFish, Liberty, WebLogic, etc. There are also Servlet containers which implement only the JSP/Servlet part of the huge Java EE API such as Tomcat, Jetty, etc.

   We can develop Web and Enterprise applications using Java EE. Java EE platforms provide an API and runtime environment for developing applications.

  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>
 
10. ### What are the limitations of Java EE (API)?
 
    - Since Java EE is an API and API is partial. Means it mostly contains interfaces & abstract classes. There may be some concrete classes, enums as well but still we need implementation to develop applications.
    - API does not provide boilerplate code.
    - API does not promote rapid application development.
    - API is huge in nature and the classes are interdependent with each other. For example: Consider the following code which will fetch the data from `mysql` database using JDBC API.
 
      ```java
      Connection con=DriverManager.getConnection("url","username","password");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from emp");
      while(rs.next()) {
        System.out.println(rs.getString(1);
      }
      ```
 
      Here ResultSet is dependent on Statement. Without having a `Statement` object we cannot create a `ResultSet` object. Again Statement is dependent on Connection. Without having a `Connection` object we cannot create a `Statement` object. Considering these facts it will take a lot of time to learn.
 
  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>
 
11. ### What is Boilerplate code? What are the problems if we write the boilerplate code?
 
    The repetitive code that every developer needs to write at many places with little or no modification to achieve some task is called the boilerplate code.
 
    How do we get the connection while executing the JDBC code?
 
    ```java
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("url","username","password");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from emp");
    while(rs.next()) {
      System.out.println(rs.getString(1);
    }
    ```
 
    - Load & register the `Driver` class.
    - Invoke the `getConnection()` method on DriverManager to obtain the `Connection` object.
    - Create the `Statement` object by invoking `createStatement()` method.
    - Get the `ResultSet` object by invoking `executeQuery("query")`.
 
    Is there any alternative to these steps? Actually, no! Whenever, wherever we have to perform JDBC operations, these same steps have to be repeated every time by everyone. This kind of repetitive code is nothing but boilerplate code. The boiler plate code makes the development unnecessarily lengthier and complex.
 
    If API does not provide boilerplate code then we need to write the huge amount of code. If we write huge amount of code then
 
    - It will take a huge amount of time.
    - It will take a huge effort.
    - We need more resources(people) and the cost of the development will become high.
    - Many chances to increase the bug.
    - It will take more time for testing and the cost of the testing will become high.
    - Maintenance of the project and making changes in the code will be difficult.
 
    Considering the above points API does not promote rapid application development. Hence instead of using Java EE we can use Spring framework as it provides the boilerplate code. Hence we can develop the same applications whatever we can build using Java EE in less time & with less amount of code.
 
  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div>
 
12. ### Can we say Spring is the replacement of Java EE?
 
    No, Spring is not the replacement of Java EE. Spring is built on the top of Java EE. Spring internally uses Java EE. Our application will talk to the Spring provided classes and Spring provided classes talk to Java EE internally. Without Java EE, the existence of the Spring will not be there. Just like Hibernate is nothing without JDBC or **Omelette (Spring) is not possible without Egg (Java EE)**. Rather we can say Spring is the complement to Java EE.
 
  <div align="right">
    <b><a href="#table-of-contents">⬆ Back to Top</a></b>
  </div
