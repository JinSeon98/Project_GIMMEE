package service;

import member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import present.Present;
import repository.MemberRepository;
import repository.PresentRepository;

import java.util.Optional;

@Service
public class recommendService {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    PresentRepository presentRepository;
    int choice;

    //회원정보 저장
    public void join(Member member) {
        memberRepository.save(member);
    }

    //선물 선택 횟수 저장
    public int choices(Long id) {

        Optional<Present> present = presentRepository.findById(id);

        if(present != null) {
            choice = present.get().getChoice();
            return choice+1;
        }
        else {
            return 1;
        }
    }

}
