package bean;

/**
 * ・商品情報データ（モデル）
 */
public class EmployeeBean {
    private String Id;
    private String Name;
    private int Price;
    private String Insert_date;
    private String Img_url;

    public void setId(String Id) {
        this.Id = Id;
    }

    public String Id() {
        return Id;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getPrice() {
        return Price;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setInsert_date(String Insert_date) {
        this.Insert_date = Insert_date;
    }

    public String getInsert_date() {
        return Insert_date;
    }

    public void setImg_url(String Img_url) {
        this.Img_url = Img_url;
    }

    public String getImg_url() {
        return Img_url;
    }
}