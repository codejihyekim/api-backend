package net.jihyeweb.api.member.service;

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
    String membershipList();
    String membershipInformation();
    String shipmentList();
    String registerMail();
    String moneyList();
    String accumulatedMoney();
    String calc();
    String bmi();
    String grade();
}
