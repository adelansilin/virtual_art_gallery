package exception;

public class ArtworkNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ArtworkNotFoundException(String message){
        super(message);
    }
}