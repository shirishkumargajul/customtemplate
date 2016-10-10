import com.geni.services.MacroOperatorService;
import com.geni.services.ResourceSpaceGeneration;



public class testService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//MacroOperatorService mos = new MacroOperatorService();
			
			ResourceSpaceGeneration rsg = new ResourceSpaceGeneration("/Users/jiangduo/Desktop/rsspace.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
