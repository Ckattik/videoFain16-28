package video_3_1;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] friends = new String[20];
		
		        friends[0] = "Masha";
		        friends[1] = "Matilda";
				friends[2] = "Rosa";
				friends[18] = "Hilary";
				friends[19] = "Natasha";
				
				int totalElements = friends.length;
				int i = 0;
				
				while(i < totalElements) {
					if(friends[i] == "Rosa") {
						break;
						
					}
					System.out.println("I love " + friends[i]);
					i++;
				}
				System.out.println("The iteration is over");
				
				
				
	}

}