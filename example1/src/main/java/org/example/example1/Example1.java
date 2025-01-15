package org.example.example1;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non spring context is: "+vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle2.getName());

        Vehicle vehicle3 = context.getBean("myBean", Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle3.getName());

        Vehicle vehicle4 = context.getBean( Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+vehicle4.getName());


        String hello = context.getBean(String.class);
        System.out.println("String value from spring context is: "+hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from spring context is: "+num);
    }
}
