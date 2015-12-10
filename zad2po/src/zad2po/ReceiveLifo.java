package zad2po;

public class ReceiveLifo extends MyAbstract {

	Queue queue = new Queue();

	@Override
	public void receiving() {
		for (int i = queue.list.size() - 1; i >= 0; i--) {
			System.out.println(queue.list.get(i));
		}
		queue.list.clear();
	}

}
