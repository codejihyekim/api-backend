package net.jihyeweb.api.member.service;

import net.jihyeweb.api.member.domain.CalcDTO;
import net.jihyeweb.api.member.domain.MemberDTO;

/**
 * packageName: net.jihyeweb.api.member.service
 * fileName        : MemberService
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
public interface MemberService {

    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
