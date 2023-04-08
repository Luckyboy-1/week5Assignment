package week5;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
        asteriskLogger.log("Moses"); 
        asteriskLogger.error("Charo"); 

        Logger spacedLogger = new SpacedLogger();
        spacedLogger.log("Moses"); 
        spacedLogger.error("Charo"); 

	}

}
