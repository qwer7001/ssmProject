import com.lanou.cost.bean.Cost;
import com.lanou.cost.service.CostService;
import com.lanou.cost.service.impl.CostServiceImpl;
import org.junit.Test;


public class Te {
    @Test
    public void t(){
        CostService service = new CostServiceImpl();
        Cost cost = new Cost();
        cost.setName("1");
        cost.setBaseDuration(1);
        cost.setBaseCost(11.0);
        cost.setUnitCost(11.0);
        cost.setDes("111");
        cost.setStatus("1");
        cost.setCostType("on");
        service.insertCost(cost);
    }
}
