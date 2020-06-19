package carSales;

public class Sold extends AbstractEvent {

    private Long id;
    private Integer carYear;
    private Integer carAccidentCnt;
    private Integer drivingYear;
    private Integer salesAmount;
    private String status;
    

    public Sold(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    public Integer getDrivingYear() {
        return drivingYear;
    }

    public void setDrivingYear(Integer drivingYear) {
        this.drivingYear = drivingYear;
    }
    
    public Integer getCarAccidentCnt() {
        return carAccidentCnt;
    }

    public void setCarAccidentCnt(Integer carAccidentCnt) {
        this.carAccidentCnt = carAccidentCnt;
    }
    public Integer getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(Integer salesAmount) {
        this.salesAmount = salesAmount;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
