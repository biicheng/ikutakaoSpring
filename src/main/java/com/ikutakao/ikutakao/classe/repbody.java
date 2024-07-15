package com.ikutakao.ikutakao.classe;

public class repbody {
    // 回傳狀態代碼(自定義)
    private String RspCode;
    // 回傳狀態訊息(自定義)
    private String RspMsg;
    // 回傳資料，型別為Object，讓回傳的資料型別可以更多樣化
    private Object RspData;

    public repbody(String RspCode, String RspMsg, String RspData) {
        this.RspCode = RspCode;
        this.RspMsg = RspMsg;
        this.RspData = RspData;
    }

    public String getRspCode() {
        return RspCode;
    }

    public void setRspCode(String RspCode) {
        this.RspCode = RspCode;
    }

    public String getRspMsg() {
        return RspMsg;
    }

    public void setRspMsg(String RspMsg) {
        this.RspMsg = RspMsg;
    }

    public Object getRspData() {
        return RspData;
    }

    public void setRspData(String RspData) {
        this.RspData = RspData;
    }

}
