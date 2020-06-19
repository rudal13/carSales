
package carSales.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="inspection", url="http://inspection:8080")
public interface InspectionService {

    @RequestMapping(method= RequestMethod.POST, path="/inspections")
    public void inspect(@RequestBody Inspection inspection);

}