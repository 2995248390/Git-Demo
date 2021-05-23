package domain;

public class Commodity {
    private Integer cid;
    private String cname;
    private Float price;
    private Kind kind;

    public Commodity() {
    }

    public Commodity(Integer cid, String cname, Float price, Kind kind) {
        this.cid = cid;
        this.cname = cname;
        this.price = price;
        this.kind = kind;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
}
