package net.jihyeweb.api.member.repository;

import net.jihyeweb.api.member.domain.CalcDTO;
import net.jihyeweb.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName: net.jihyeweb.api.member.repository
 * fileName        : MemberRepositoryImpl
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }

    @Override
    public String login(MemberDTO login) {
        return null;
    }
}
