import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        Integer min = new Integer (nums.get(0));
        for (int i = 0; i<nums.size()-1;i++) {
            if (nums.get(i) < min) {
                min =  nums.get(i); 
            }
        }
        nums.remove(min);
    }
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
}
