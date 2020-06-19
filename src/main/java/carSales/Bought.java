package carSales;

public class Bought extends AbstractEvent {

    private Long id;
    private String carName;
    private Integer carYear;
    private Integer carAccidentCnt;
    private Integer buyAmount;

    public Bought(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }
    public Integer getCarAccidentCnt() {
        return carAccidentCnt;
    }

    public void setCarAccidentCnt(Integer carAccidentCnt) {
        this.carAccidentCnt = carAccidentCnt;
    }
    public Integer getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Integer buyAmount) {
        this.buyAmount = buyAmount;
    }
}
