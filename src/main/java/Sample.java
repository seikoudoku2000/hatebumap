import java.util.List;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

import com.seikoudoku2000.hatebumap.entity.Mapdata;
import com.seikoudoku2000.hatebumap.service.GetMapDataService;


public class Sample {
	
	public static void main(String[] args) {
		SingletonS2ContainerFactory.init();
		GetMapDataService service = 
			SingletonS2Container.getComponent(GetMapDataService.class);
		List<Mapdata> list = service.find(10, 584, -209, 585, -208);
		System.out.println(list.size());
	}
}
