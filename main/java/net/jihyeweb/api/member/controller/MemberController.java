package net.jihyeweb.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.jihyeweb.api.member.domain.CalcDTO;
import net.jihyeweb.api.member.domain.MemberDTO;
import net.jihyeweb.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: net.jihyeweb.api.member.controller
 * fileName        : MemberController
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    public String calc(@RequestBody CalcDTO calc){
       return service.calc(calc);
    }
    public String bmi(@RequestBody MemberDTO bmi) {
        return service.bmi(bmi);
    }
    public String grade(@RequestBody MemberDTO grade){
        return service.grade(grade);
    }
    public String login(@RequestBody MemberDTO login){
        return service.login(login);
    }
}
