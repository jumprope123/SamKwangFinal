public class SamKwangVO {
    private int prodNo;
    private int orderNo;
    private int custNo;
    private String custName;
    private String addr;
    private String city;
    private String postNo;
    private String callNo;
    private String ordDate;
    private String dueDate;
    private int empNo;
    private int qnt;
    private String prodName;
    private String prodType;
    private int unitPrice;
    private int stock;
    private int expsId;
    private String expsName;
    private String empCall;
    private String personNo;
    private String name;
    private String dept;
    private String jobName;
    private String h_date;


    public SamKwangVO() {
    }

    public SamKwangVO(int prodNo, int orderNo, int custNo, String custName, String addr, String city, String postNo, String callNo, String ordDate, String dueDate, int empNo, int qnt, String prodName, String prodType, int unitPrice, int stock) {
        this.prodNo = prodNo;
        this.orderNo = orderNo;
        this.custNo = custNo;
        this.custName = custName;
        this.addr = addr;
        this.city = city;
        this.postNo = postNo;
        this.callNo = callNo;
        this.ordDate = ordDate;
        this.dueDate = dueDate;
        this.empNo = empNo;
        this.qnt = qnt;
        this.prodName = prodName;
        this.prodType = prodType;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }


    public SamKwangVO(int empNo,int orderNo,  int expsId,  String expsName, String ordDate,   String jobName) {
        this.orderNo = orderNo;
        this.ordDate = ordDate;
        this.empNo = empNo;
        this.expsId = expsId;
        this.expsName = expsName;
        this.jobName = jobName;
    }

    public SamKwangVO(int empNo, int orderNo, int expsId, String expsName, String empCall, String ordDate, String dueDate, int custNo, String personNo, String name, String dept, String jobName, String h_date) {
        this(empNo,orderNo,expsId,expsName,ordDate,jobName);
        this.custNo = custNo;
        this.dueDate = dueDate;
        this.empCall = empCall;
        this.personNo = personNo;
        this.name = name;
        this.dept = dept;
        this.h_date = h_date;
    }

    public int getExpsId() {
        return expsId;
    }

    public void setExpsId(int expsId) {
        this.expsId = expsId;
    }

    public String getExpsName() {
        return expsName;
    }

    public void setExpsName(String expsName) {
        this.expsName = expsName;
    }

    public String getEmpCall() {
        return empCall;
    }

    public void setEmpCall(String empCall) {
        this.empCall = empCall;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getH_date() {
        return h_date;
    }

    public void setH_date(String h_date) {
        this.h_date = h_date;
    }

    public int getProdNo() {
        return prodNo;
    }

    public void setProdNo(int prodNo) {
        this.prodNo = prodNo;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
