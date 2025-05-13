package jjc.edu.week17.homework17;
//Oscar Alcantar
//Homework17
//Description working with databases using java
public class DBConnectionConfig {


    public static final String connectionUrl =
            "jdbc:sqlserver://DESKTOP-E6OIR7N\\SQLEXPRESS;"
                    + "database=AdventureWorks2019;"
                    + "integratedSecurity=true;";

    public static final String SELECT_QUERY =
            //Change query to employees
            "SELECT socialSecurityNumber, firstName, lastName, birthday, employeeType, departmentName FROM employees";
}
