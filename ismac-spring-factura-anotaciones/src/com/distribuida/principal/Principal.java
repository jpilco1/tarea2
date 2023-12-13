package com.distribuida.principal;
import java.util.Date;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;
import com.distribuida.entities.detalleFactura;
import com.distribuida.entities.Producto;

public class Principal {
public static void main(String[]args) {
	
	System.out.println("************************1****************************");
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	System.out.println("************************2****************************");
	
	Clientes cliente = context.getBean("cliente",Clientes.class);
	Producto producto = context.getBean("producto",Producto.class);
	Factura factura = context.getBean("factura",Factura.class);
	detalleFactura detalleFactura = context.getBean("detalleFactura",detalleFactura.class);
	DatosEmpresa datosEmpresa = context.getBean("datosEmpresa",DatosEmpresa.class);
	cliente.setIdCliente(1);
	cliente.setCedula("1755378385");
	cliente.setNombre("Jimmy");
	cliente.setApellido("Pilco");
	cliente.setEdad(21);
	cliente.setFechaNacimiento(new Date());
	cliente.setDireccion("Tumbaco");
	cliente.setTelefono("0995547735");
	cliente.setCorreo("jimmypt910@gmail.com");
	
	
	producto.setIdProducto(1);
	producto.setNombre("Peras");
	producto.setDescripcion("caja de peras");
	producto.setPrecio(14.50);
	producto.setStock(200);
	

	factura.setIdFactura(1);
	factura.setNumFactura("FAC-001");
	factura.setFecha(new Date());
	factura.setTotalNeto(56.50);
	factura.setIva(0.12);
	factura.setTotal(60.45);
	
	detalleFactura.setIdFacturaDetalle(1);
	detalleFactura.setCantidad(8);
	detalleFactura.setSubtotal(84.60);
	System.out.println(factura.toString());
	System.out.println(detalleFactura.toString());
	System.out.println(datosEmpresa.toString());
	
	System.out.println("************************4****************************");
	context.close();
	System.out.println("************************3****************************");
}

}
