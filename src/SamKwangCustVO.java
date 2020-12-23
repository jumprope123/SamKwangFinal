public class SamKwangCustVO {
    int custNo;
    private String custName;
    private String custAddr;
    private String custCity;
    private String postNo;
    private String callNo;

    public SamKwangCustVO() {
    }

    public SamKwangCustVO(int custNo, String custName, String callNo) {
        this.custNo = custNo;
        this.custName = custName;
        this.callNo = callNo;
    }

    public SamKwangCustVO(int custNo, String custName, String custAddr, String custCity, String postNo, String callNo) {
        this.custNo = custNo;
        this.custName = custName;
        this.custAddr = custAddr;
        this.custCity = custCity;
        this.postNo = postNo;
        this.callNo = callNo;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }

    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }
}
