package net.jihyeweb.api.member.domain;

/**
 * packageName: net.jihyeweb.api.member.domain
 * fileName        : MemberDTO
 * author          : codejihyekim
 * date            : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         codejihyekim      최초 생성
 */
public class MemberDTO {
    private String memId;
    private String memName;
    private int memNumber;
    private String add;
    private String phone1;
    private String phone2;
    private int height;

    public final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public int getMemNumber() {
        return memNumber;
    }

    public void setMemNumber(int memNumber) {
        this.memNumber = memNumber;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }

    private String debutDate;
}
