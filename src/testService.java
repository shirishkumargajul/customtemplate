
import com.geni.services.ResourceSpaceGeneration;



public class testService {

	public static void main(String[] args) {
		try {
			//MacroOperatorService mos = new MacroOperatorService();
			
			@SuppressWarnings("unused")
			ResourceSpaceGeneration rsg = new ResourceSpaceGeneration("/Users/jiangduo/Desktop/rsspace.csv");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
