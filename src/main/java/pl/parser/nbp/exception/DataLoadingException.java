package pl.parser.nbp.exception;

public class DataLoadingException extends RuntimeException {

	public DataLoadingException(Exception e) {
		super(e);
	}

	public DataLoadingException(String msg) {
		super(msg);
	}
}
