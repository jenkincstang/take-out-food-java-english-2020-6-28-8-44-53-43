import java.util.ArrayList;
import java.util.List;

public class ItemRepositoryImpl implements ItemRepository{

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		List<Item> items = new ArrayList<Item>();
		Item item0001 = new Item("ITEM0001", "Braised chicken", 18.0);
		Item item0013 = new Item("ITEM0013", "Chinese hamburger", 6.0);
		Item item0022 = new Item("ITEM0022", "Cold noodles", 8.0);
		items.add(item0022);
		items.add(item0013);
		items.add(item0001);
		return items;
	}

}
