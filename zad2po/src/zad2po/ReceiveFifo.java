package zad2po;


public class ReceiveFifo extends MyAbstract {

	Queue queue = new Queue();

	@Override
	public void receiving() {
		for (int i = 0; i < queue.list.size(); i++) {
			System.out.println(queue.list.get(i));
		}
		queue.list.clear();

	}

}
