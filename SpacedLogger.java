package week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String spacedLog = String.join(" ", log.split(""));
        System.out.println(spacedLog);
		
	}

	@Override
	public void error(String error) {
		 String spacedError = "ERROR: " + String.join(" ", error.split(""));
	        System.out.println(spacedError);
		
	}

}
