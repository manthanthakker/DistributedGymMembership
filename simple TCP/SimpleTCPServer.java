import java.io.*; 
import java.nio.*;
import java.net.*; 
class SimpleTCPServer 
{    
	public static void main(String argv[]) throws Exception       
	{          
		String clientSentence;          
		String capitalizedSentence;          
		ServerSocket welcomeSocket = new ServerSocket(6789);          
		System.out.println("Server Waiting for Connections on Port 6789");
		while(true)          
		{             
			Socket connectionSocket = welcomeSocket.accept();             
			System.out.println("Client Connected ");
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); 
			System.out.println("Obtained a handle on Client Input Stream");
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());         
			System.out.println("Obtained a handle on Client Output Stream");    					
			clientSentence = inFromClient.readLine();             
			System.out.println("Received: " + clientSentence);             
			capitalizedSentence = clientSentence.toUpperCase() + '\n';             
			outToClient.writeBytes(capitalizedSentence);
			System.out.println("Message Sent");          
		}       
	} 
}