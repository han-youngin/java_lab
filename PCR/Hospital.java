package PCR;

import lombok.Data;

@Data
public class Hospital {
    private String addr;
    private int mgtStaDd;
    private String pcrPsblYn;
    private String ratPsblYn;
    private int recuClCd;
    private String rprtWorpClicFndtTgtYn;
    private String sgguCdNm;
    private String sidoCdNm;
    private int telno;
    private int XPosWgs84;
    private int YPosWgs84;
    private String yadmNm;
    private String ykihoEnc;

    public Hospital(String addr,
            int mgtStaDd,
            String pcrPsblYn,
            String ratPsblYn,
            int recuClCd,
            String rprtWorpClicFndtTgtYn,
            String sgguCdNm,
            String sidoCdNm,
            int telno,
            int XPosWgs84,
            int YPosWgs84,
            String yadmNm,
            String ykihoEnc)

    {
        this.addr = addr;
        this.mgtStaDd = mgtStaDd;
        this.pcrPsblYn = pcrPsblYn;
        this.ratPsblYn = ratPsblYn;
        this.recuClCd = recuClCd;
        this.rprtWorpClicFndtTgtYn = rprtWorpClicFndtTgtYn;
        this.sgguCdNm = sgguCdNm;
        this.sidoCdNm = sidoCdNm;
        this.telno = telno;
        this.XPosWgs84 = XPosWgs84;
        this.YPosWgs84 = YPosWgs84;
        this.yadmNm = yadmNm;
        this.ykihoEnc = ykihoEnc;
    }

}
