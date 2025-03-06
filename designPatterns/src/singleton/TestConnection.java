package singleton;

public class TestConnection {

	public static void main(String[] args) {
		Connection connection = Connection.getInstance();
		connection.setConnectionName("JDBC:ODBC:DRIVER");
		connection.setPort(8080);
		
		System.out.println("Connection Name : "+ connection.getConnectionName() 
		             +" and connection port is : "+ connection.getPort());
		
		
		
		Connection connection2 = Connection.getInstance();
		
		System.out.println("Connection Name : "+ connection2.getConnectionName() 
        +" and connection port is : "+ connection2.getPort());
		
		
		connection2.setConnectionName("ORACLE:DRIVER");
		connection2.setPort(9091);
		
		System.out.println("Connection Name : "+ connection.getConnectionName() 
        +" and connection port is : "+ connection.getPort());
		
		System.out.println("Connection Name : "+ connection2.getConnectionName() 
        +" and connection port is : "+ connection2.getPort());
		
		
		
	}
}
