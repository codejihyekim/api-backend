package net.jihyeweb.api.member.service;

import lombok.RequiredArgsConstructor;
import net.jihyeweb.api.member.domain.CalcDTO;
import net.jihyeweb.api.member.domain.MemberDTO;
import net.jihyeweb.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * packageName: net.jihyeweb.api.member.service
 * fileName        : MemberServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        return repository.calc(calc);
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return repository.bmi(bmi);
    }

    @Override
    public String grade(MemberDTO grade) {
        return repository.grade(grade);
    }

    @Override
    public String login(MemberDTO login) {
        return repository.login(login);
    }
}
