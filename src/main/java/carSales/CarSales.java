package carSales;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

@Entity
@Table(name="CarSales_table")
public class CarSales {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String carName;
    private Integer carYear;
    private Integer carAccidentCnt;
    private Integer buyAmount;
    private Integer drivingYear;
    private Integer salesAmount;
    private String status;

    @PostPersist
    public void onPostPersist(){
        Bought bought = new Bought();
        BeanUtils.copyProperties(this, bought);
        bought.publishAfterCommit();

        carSales.external.Inspection inspection = new carSales.external.Inspection();
        Application.applicationContext.getBean(carSales.external.InspectionService.class)
            .inspect(inspection);
    }

    @PostUpdate
    public void onPostUpdate(){
    	if (!"insured".equals(this.getStatus())) {
        Sold sold = new Sold();
        BeanUtils.copyProperties(this, sold);
        sold.publishAfterCommit();
    	}

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

    public Integer getDrivingYear() {
        return drivingYear;
    }

    public void setDrivingYear(Integer drivingYear) {
        this.drivingYear = drivingYear;
    }


}
