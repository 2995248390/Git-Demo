package domain;

import java.util.List;

public class Kind {
    private Integer kid;
    private String kname;
    private List<Commodity> commodityList;

    public Kind() {
    }

    public Kind(Integer kid, String kname, List<Commodity> commodityList) {
        this.kid = kid;
        this.kname = kname;
        this.commodityList = commodityList;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }
}
