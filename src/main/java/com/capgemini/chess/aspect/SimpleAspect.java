package com.capgemini.chess.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.capgemini.chess.dataacess.dto.UserDto;

@Component

@Aspect
public class SimpleAspect {

	private final static Logger LOG = Logger.getLogger(SimpleAspect.class);

	@Around("execution(* com.capgemini.chess.service.*.*(..))&&args(userDto)")
	public Object before(ProceedingJoinPoint pjp,UserDto userDto) {
		String methodName = pjp.getSignature().getName();
		LOG.info("Going to call the method " + methodName);
	
		
		long start = System.currentTimeMillis();
		Object value = null;
		try {
			pjp.getArgs();
			value = pjp.proceed();
		} catch (Throwable e) {
			LOG.fatal(e.getMessage());
		}
		//LOG.info("Value is: "+id);
		LOG.info("Value is: "+userDto.getName());
		long elapsedTime = System.currentTimeMillis() - start;
		LOG.info("Method execution completed.");
		LOG.info("Method execution time: " + elapsedTime + " milliseconds.");
		
		return value;
	}

	
}
