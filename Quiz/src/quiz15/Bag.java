package quiz15;

public class Bag implements IBag {
	
	private String[] items = new String[100];
	public int index = 0;
	
	@Override
	public void insert(String item) {
		items[index] = item;
		index++;
		
	}

	@Override
	public void print() {
		for (int i = 0; i < index; i++) {
			if(i == index-1) {
				System.out.println(items[i]);
			} else {
				System.out.print(items[i]+", ");
				
			}
				
		}
		
	}

	@Override
	public int search(String item) {
		for (int i = 0; i < index; i++) {
			if(item.equals(items[i])) {
				return i;
			} 
		}	
		return -1;
	}

	@Override
	public boolean delete(String item) {
		
		if(item == null) return false;
		
		for(int i = 0; i<index; i++) {
			//찾은 경우의 조건
			if(items[i].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for(int j = i; j<index-1; j++) {
					items[j] = items[j+1];
				}
				items[index-1] = null;
				index--;
				return true;
			}
		}
		
		return false;
		
	}
	
}
