package carSales;

public class Insured extends AbstractEvent {

    private Long id;
    private Long carId;
    private Integer insureRate;
    private Integer insureAmount;
    private String status;

    public Insured(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
    public Integer getInsureRate() {
        return insureRate;
    }

    public void setInsureRate(Integer insureRate) {
        this.insureRate = insureRate;
    }
    public Integer getInsureAmount() {
        return insureAmount;
    }

    public void setInsureAmount(Integer insureAmount) {
        this.insureAmount = insureAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
