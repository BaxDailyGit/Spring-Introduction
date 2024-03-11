package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 직접 등록 장점: 구현 클래스를 변경하고자 할 때, SpringConfig만 변경하면 된다.
// 직접 등록 단점:

// DI (Dependency Injection)에는 3가지가 있다.
// 1. 필드 주입
// 2. setter 주입
// 3. 생성자 주입

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
