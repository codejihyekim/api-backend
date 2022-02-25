package net.jihyeweb.api.member.repository;

import net.jihyeweb.api.member.domain.CalcDTO;
import net.jihyeweb.api.member.domain.MemberDTO;

/**
 * packageName: net.jihyeweb.api.member.repository
 * fileName        : MemberRepository
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
