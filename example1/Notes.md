Few Concepts:
1. IoC and DependencyInversion:
   IoC: It is the Software Design Principle , where the control flow of the program is inverted, instead of the programmer controlling the flow of a program
   the "the framework or service" takes control of teh program flow. Never actually create the objects directly but describes the way in which the
   object is being created.

   DependencyInversion: It is the Software Design Pattern through which Inversion of Control is achieved. The responsibility of creating objects id shifted
   from the application to the Spring IoC container. It reduces coupling between multiple objects as it is dynamically injected by the
   framework.

2. Advantages of IoC and Di:
   A. Loose Coupling between the components.
   B. Minimizes the amount of code in our application.
   C. Makes unit testing easy with the different mocks.
   D. Increased System Maintainability & Module Reusability.
   E. Allows Concurrent or Independent Development.
   F. Replacing Modules has no side effects on other modules.

3. Beans: Any normal Java class that is instantiated, assembled and managed by a Sporing IoC container is called Spring Bean.
   When a java class is maintained by the Spring CContainer , that java class is known as Bean.
4. Context: it is like a memory location of our app in which add all the object instances that we want the framework to manage. By default, Spring
   doesnt know any of the objects we define in our applications. To enable Spring to see our objects, we need to add them to the context.
5. Spring Expression Language (SpEL): Powerful expression Language for querying and manipulating an object graph at runtime like setting and getting
   property values, property assignment , method invocation, etc.
6. Spring IOC Container:
   >> its responsibilities:
   > to instantiate the application class
   > to configure the object
   > to assemble the dependencies between the objects.

   >> There are 2 IoC Containers:
   > beans.factory.BeanFactory (very basic IoC container, it will not provide advance features, only handles bean creation, bean maintainence, auto wiring and injecting the dependencies based upon DI pattern)
   > context.ApplicationContext (advance IoC container, and it implements BeanFactory Also, It also provides extra features: pre-bean code, or before destryong a bean, any code to be executed. All of the event publishing
   around the spring beans can be handled with the help of application context interface and its implementations)

   Spring Container uses Dependency Injection (DI) to manage the components/objects that make up an application.
   Spring IoC CContainer comprises 4 important things:
    1. Spring Core Libraries (IoC Principle and DI pattern)
    2. Context (it is virtual memory location inside the spring framework)
    3. SPEL
    4. Beans

7. @Bean annotation lets spring know that it needs to call this method when it initializes its context and adds the returned
    object/value to the Spring context/Spring IoC Container.
` @Bean 
Vehicle vehicle(){
var vehcile = new vehicle()
veh.setName("Audi 8"); return veh;
}`
8. @Configuration It will let IoC container to scan all the content of this class because this is an indication
   to the spring framework that the developer has done some changes which will result into creating beans.
   So during the startup or during the initialization of the IoC container , it will make sure it is reading all the
   content of this class.