package Network;

public class ServerStatusMessage<S> extends Message<S>{
//This message informs if the server is active and how much more tasks he is able to process
	int free;
	
	public ServerStatusMessage(S server, int freeProcessors){
		super(server);
		free = freeProcessors;	
	}
	
	public boolean isBusy(){return free == 0;}
	
	public int getFreeProcessorsQtd(){ return free;}
}
