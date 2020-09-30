package co.aioros.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleados {

	public static void main(String[] args) {
		/*Empleados empleado1=new DirectorEmpleado();
		System.out.println(empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados Diego=contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(Diego.getTareas());
		System.out.println(Diego.getInformes());
		contexto.close();*/
		
		/*Empleados Maria=contexto.getBean("miSecretarioEmpleado",Empleados.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInformes());
		contexto.close();*/
		
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInformes());
		System.out.println("Email: "+Maria.getEmail());
		System.out.println("Nombre Empresa: "+Maria.getNombreEmpresa());
		
		contexto.close();
	}

}

