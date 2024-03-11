package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    //필드주입(비권장)
    // @Autowired private final MemberService memberService;

    private final MemberService memberService;
    // 생성자 주입 (권장)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // setter 주입(비권장)
    // @Autowired
    // public void setMemberService(MemberService memberService) {
    // setter 주입 단점: public으로 열려있어야 하고, 중간에 바꿀 수 있어서 위험하다.

}
