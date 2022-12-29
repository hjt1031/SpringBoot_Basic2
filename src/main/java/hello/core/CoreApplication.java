package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}


/* 복습
@Bean
* 1. 스프링 컨테이너 등록 Bean => AnnotationConfigApplicationContext 로 호출 (컨테이너에 저장되어있음)
* 2. 스프링 컨테이너에 값 은 리턴되는 값 (주소) 가 저장 됨
* 3. getBean 으로 꺼내서 사용


@Component
1. 구현체 에다가 @Component 등록 하면 자동으로 스프링 컨테이너에 등록 됨
2. @AutoWried 로 의존성 주입  = ac.getBean(MemberRepository.class) 라 생각하면 됨.
* */

