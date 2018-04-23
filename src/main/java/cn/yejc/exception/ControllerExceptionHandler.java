package cn.yejc.exception;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {
	
	private static final Logger logger = Logger.getLogger(ControllerExceptionHandler.class.getName());
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception ex) {
		logger.info("catch exception:"+ ex.toString());
		return ex.getMessage();
	}
	
	@ExceptionHandler(value=RuntimeException.class)
	public String handleRuntimeException(RuntimeException ex) {
		logger.info("catch runtimeException:"+ ex.toString());
		return ex.getMessage();
	}
}
