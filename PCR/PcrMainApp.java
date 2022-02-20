package PCR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class PcrMainApp {
  public static void main(String[] args) {
    List<Hospital> HospitalList = PcrData.getHospitalLIst();
    PreparedStatement pstmt;

    try {
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.124.112.253:1521:xe", "SCOTT2", "TIGER2");
      System.out.println("DB연결완료");

      String sql = "INSERT INTO hospital(addr, mgtStaDd, pcrPsblYn, ratPsblYn, recuClCd, rprtWorpClicFndtTgtYn, sgguCdNm, sidoCdNm, telno, XPosWgs84, YPosWgs84, yadmNm, ykihoEnc) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
      pstmt = conn.prepareStatement(sql);

      for (int i = 0; i < HospitalList.size(); i++) {
        pstmt.setString(1, HospitalList.get(i).getAddr());
        pstmt.setInt(2, HospitalList.get(i).getMgtStaDd());
        pstmt.setString(3, HospitalList.get(i).getPcrPsblYn());
        pstmt.setString(4, HospitalList.get(i).getPcrPsblYn());
        pstmt.setInt(5, HospitalList.get(i).getRecuClCd());
        pstmt.setString(6, HospitalList.get(i).getRprtWorpClicFndtTgtYn());
        pstmt.setString(7, HospitalList.get(i).getSgguCdNm());
        pstmt.setString(8, HospitalList.get(i).getSidoCdNm());
        pstmt.setInt(9, HospitalList.get(i).getTelno());
        pstmt.setInt(10, HospitalList.get(i).getXPosWgs84());
        pstmt.setInt(11, HospitalList.get(i).getYPosWgs84());
        pstmt.setString(12, HospitalList.get(i).getYadmNm());
        pstmt.setString(13, HospitalList.get(i).getYkihoEnc());

        pstmt.executeUpdate();
      }

      System.out.println("통신끝");

    } catch (Exception e) {
      // e.printStackTrace();
      System.out.println("PCR : " + e.getMessage());
    }
    // System.out.println(Result);
  }
}
