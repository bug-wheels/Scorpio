package io.github.bw.scorpio.common.exception;

public class PreconditionIllegalPermissionsException extends PreconditionException {

  public PreconditionIllegalPermissionsException(String errorMessage) {
    super(errorMessage);
  }

  public PreconditionIllegalPermissionsException() {
    super();
  }
}
