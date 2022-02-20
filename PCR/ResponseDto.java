package PCR;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class ResponseDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount; // ??

            @Data
            @AllArgsConstructor
            public class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                public class Item {
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
                }

            }

        }

    }
}
