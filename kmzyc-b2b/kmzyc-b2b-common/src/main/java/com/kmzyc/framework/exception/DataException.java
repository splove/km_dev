package com.kmzyc.framework.exception;

/**
 * 数据异常类
 * 
 * @author
 * @since 1.0
 * @see BaseException
 */
public class DataException extends BaseException {

  private static final long serialVersionUID = 7138217038057726081L;

  public DataException() {}

  public DataException(String message) {
    super(message);
  }

}
