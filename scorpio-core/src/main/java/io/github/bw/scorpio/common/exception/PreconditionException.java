package io.github.bw.scorpio.common.exception;

public class PreconditionException extends RuntimeException {

  public PreconditionException() {
    super();
  }

  public PreconditionException(String s) {
    super(s);
  }

  public PreconditionException(String message, Throwable cause) {
    super(message, cause);
  }

  public PreconditionException(Throwable cause) {
    super(cause);
  }

}
