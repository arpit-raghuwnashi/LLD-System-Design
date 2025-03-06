package singleton;

public class Connection {

	private static Connection connection;
	
	private String connectionName;
	private int port;
	
	private Connection() {

	}

	public static Connection getInstance() {
		if (connection == null) {
			// handle for multithreaded env
			synchronized (Connection.class) {
				if (connection == null) {
					connection = new Connection();
				}
			}
		}
		return connection;
	}


	public String getConnectionName() {
		return connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
