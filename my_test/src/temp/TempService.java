package temp;

public class TempService {
	private TempDTO dto = new TempDTO();
	public void up() {
		int t = dto.getTemp();
		dto.setTemp(++t);
		//System.out.println(dto.getTemp());
	}
	
	public void down() {
		int t = dto.getTemp();
		dto.setTemp(--t);
		//System.out.println(dto.getTemp());
	}
	
	public void display() {
		System.out.println("현재 온도 : "+dto.getTemp());
	}
}
