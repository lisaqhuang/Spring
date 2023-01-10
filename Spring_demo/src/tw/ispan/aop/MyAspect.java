package tw.ispan.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before(value="execution(* tw.ispan.model.EnglishTeacher.*(..))")
	public void before() {
		
		//驗證程式
		System.out.println("跑在xxx方法前");
	}
	
	@After(value="execution(* tw.ispan.model.EnglishTeacher.*(..))")
	public void after() {
		//訂單成功.....
		System.out.println("跑在xxx方法後");
	}

	@Around(value="execution(* tw.ispan.model.EnglishTeacher.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("方法前");
		Object obj = joinpoint.proceed();
		
		System.out.println("方法後");
		return obj;
	}
}
