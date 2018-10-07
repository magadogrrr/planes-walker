package org.toad_and_sprocket.planes_walker.config;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.apache.catalina.core.ApplicationContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.toad_and_sprocket.planes_walker.repository.OAuthRepository;

@Component
@Aspect
public class OAuthAspect {

	@Autowired
	private OAuthRepository oauthDao;
	
	@Autowired
	private ApplicationContext appContext;

	@Pointcut("within(@annotation(oauthClassClient) *)")
	public void insideAnnotation() {
	}

	@Pointcut("execution(!@annotation(oauthMethodClient) RestTemplate.*(args(url)))")
	public void methodBare() {
	}

	@Pointcut("execution(@annotation(oauthMethodClient) RestTemplate.*(args(url)))")
	public void methodAnnotated() {
	}

	private Function<String, RestTemplate> authorizeRequest = t->oauthDao.findById(t).;
	@Around("insideAnnotation() && methodBare()")
		public void addClientClassAuth(OAuth2Client oauthClassClient, ProceedingJoinPoint joinPoint) throws Throwable {
			OAuth2RestTemplate authorizedTemplate = new OAuth2RestTemplate(details.get());
			Object[] args= joinPoint.getArgs();
			IntStream.range(0, args.length).filter(templatey)
			
			joinPoint.proceed(arguments);
		}

	@Around("methodAnnotated()")
	public void addClientMethodAuth(OAuth2Client oauthMethodClient, ProceedingJoinPoint joinPoint) {

	}

}
