package hutech.dacn.hospital.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
public class ApplicationException extends RuntimeException{
  protected ErrorCode errorCode;

  public ApplicationException(ErrorCode errorCode){
    this(errorCode,"");
  }
  public ApplicationException(ErrorCode errorCode,Throwable throwable){
    super(errorCode.getMessage(),throwable);
    this.errorCode = errorCode;
  }

  public ApplicationException(ErrorCode errorCode,String message){
    super(message);
    this.errorCode = errorCode;
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
  }
}
