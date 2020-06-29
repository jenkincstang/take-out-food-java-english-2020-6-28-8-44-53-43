import java.util.ArrayList;
import java.util.List;

public class SalesPromotionRepositoryImpl implements SalesPromotionRepository{

	@Override
	public List<SalesPromotion> findAll() {
		// TODO Auto-generated method stub
		List<SalesPromotion> lists = new ArrayList<SalesPromotion>();
		
		List<String> relatedItems = new ArrayList<String>();
		relatedItems.add("ITEM0001");
		relatedItems.add("ITEM0022");
		
		SalesPromotion salesPromotion = new SalesPromotion("Half Price", "Half Price", relatedItems);
		
		lists.add(salesPromotion);
		
		return lists;
	}

}
