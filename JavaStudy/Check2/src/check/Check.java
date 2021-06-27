package check;

public class Check {
	
	public static void main(String[] args) {

		String firstName = "前田";
    	String lastName = "凌児";
        System.out.println("printNameメソッド → " + printName(firstName, lastName));
        
        Pet pet = new Pet("java吉","hoge");
    	pet.introduce();
    	
		RobotPet robotpet = new RobotPet("R2D2","ルーク");
    	robotpet.introduce();
        
        }
	
        private static String printName(String firstName , String lastName) {
    		return firstName + lastName ;     
	}
    	
		
        
} 