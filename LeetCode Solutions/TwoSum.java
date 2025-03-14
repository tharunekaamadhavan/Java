import java.util.*;
public class TwoSum {

    public static int[] twoSum(int []nums,int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum");
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len=sc.nextInt();
    System.out.println("Enter the elements in the array: ");
    int []nums=new int[len];
    for(int i=0;i<len;i++){
        nums[i]=sc.nextInt();
    };
    System.out.println("Enter the target number: ");
    int target=sc.nextInt();
    int []result=twoSum(nums,target);
    System.out.println("Indices: ["+result[0]+","+result[1]+"]");
    sc.close();
    }
}
