package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.nt.doman.Employee;

@Path("/employee")
public class EmployeeResource {
 //http://localhost:8030/Proj4_JAX-RS-Anno_EmployeeResource/employee/1025
	@GET
	@Path("{empid}")
	@Produces({"application/xml","application/json"})
	public Employee getEmployeeByid(@PathParam("empid") String empid) {
		System.out.println("EmployeeResource.getEmpByid()");
		Employee emp=new Employee();
		emp.setEmpid(Integer.parseInt(empid));
		emp.setName("Shiva");
		emp.setSalary(600);
		emp.setEmail("shiva@1234");
		return emp;
		
	}
		
	@GET
	@Path("{empid}/{name}")
	@Produces({"application/xml","application/json"})
	public Employee getEmployeeByid(@PathParam("empid") Integer empid , @PathParam("name") String name) {
		System.out.println("EmployeeResource.getEmpByid()");
		Employee emp=new Employee();
		emp.setEmpid(empid);
		emp.setName(name);
		emp.setSalary(600);
		emp.setEmail("shiva@1234");
		return emp;
		
	}
	/*
	@GET
	@Path("/empid")
	@Produces({"application/xml","application/json"})
	public Employee getEmployeeByid(@QueryParam("empid") String empid) {
		System.out.println("EmployeeResource.getEmpByid()");
		Employee emp=new Employee();
		emp.setEmpid(Integer.parseInt(empid));
		emp.setName("Shiva");
		emp.setSalary(600);
		emp.setEmail("shiva@1234");
		return emp;
	}
	
	@Path("/info")
	@Produces({"application/xml","application/json"})
	public Employee getEmployeeByid(@QueryParam("empid") Integer empid , @QueryParam("name") String name) {
		System.out.println("EmployeeResource.getEmpByid()");
		Employee emp=new Employee();
		emp.setEmpid(empid);
		emp.setName(name);
		emp.setSalary(600);
		emp.setEmail("shiva@1234");
		return emp;
		
	}*/
	
	/*@GET
	@Path("/isbn")
	public String findPriceByIsbn(@QueryParam("isbn") String isbn) {
		System.out.println("BookResource :: findPriceByIsbn called");

		System.out.println("ISBN :: " + isbn);

		String responseMsg = "Book Price is $300.00";

		return responseMsg;
	}
*/	
	
}
