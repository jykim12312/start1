package st.start1.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @SpringBootApplication 스프링부트 자동설정 스프링빈 읽기 생성 자동, 프로젝트 최상단
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
//   SpringApplication.run 내장 WAS 실행, Jar로 실행, 톰캣 사용안함
    }

}
