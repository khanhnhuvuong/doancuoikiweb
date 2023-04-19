package vn.edu.hcmuaf.ttt.model;

public class Category {
    private int cid;
    private String cName;

    public Category(){

    }

    public Category(int cid, String cName) {
        this.cid = cid;
        this.cName = cName;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", cName='" + cName + '\'' +
                '}';
    }
}
