package hello.hellospring.domain;

public class Member {

    private Long id; // 시스템이 저장하는 아이디
    private String name; // 회원 이름

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
