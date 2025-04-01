package L6_Sliding_Window_And_Two_Pointer;
// Name of Prblm -Find length of the longest subarray containing
//                atmost two distinct integers
public class Prblm3_Fruit_Into_Baskets {
    public static int totalFruit(int[] fruits, int basket){
        /*
            // Solution 1: Using HashMap (Time Complexity: O(N) & Space Complexity: O(N))
            HashMap<Integer, Integer> map = new HashMap<>();
            int i = 0, j = 0, ans = 0;
            while(j < fruits.length){
                map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
                while(map.size() > 2){
                    map.put(fruits[i], map.get(fruits[i]) - 1);
                    if(map.get(fruits[i]) == 0){
                        map.remove(fruits[i]);
                    }
                    i++;
                }
                ans = Math.max(ans, (j - i) + 1);
                j++;
            }
            return ans;
        */

        // Optimized Approach: Time Complexity: O(N) & Space Complexity: O(1).
        int last_fruit = -1;
        int second_last_fruit = -1;
        int last_fruit_count = 0;
        int current_max = 0;
        int max = 0;
        for(int fruit: fruits){
            if(fruit == last_fruit || fruit == second_last_fruit){
                current_max += 1;
            }
            else{
                current_max = last_fruit_count + 1;
            }
            if(fruit == last_fruit){
                last_fruit_count += 1;
            }
            else{
                last_fruit_count = 1;
            }
            if(fruit != last_fruit){
                second_last_fruit = last_fruit;
                last_fruit = fruit;
            }
            max = Math.max(current_max, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int basket = 2;
        System.out.println(totalFruit(fruits, basket));
    }
}
