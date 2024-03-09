package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();


    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("hello");
        // when
        Long saveId = memberService.join(member);
        // then
        Member findMember = memberService.findOne(saveId).get(); // 이부분 어렵다. 복습 필요
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }


    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}