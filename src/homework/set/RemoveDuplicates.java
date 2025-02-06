package homework.set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 3, 5};
        
        SET<Integer> set = new HashSet<>();
        Iterator<Integer> it = input.iterator();
        while(it.hasNext()) {
            set.add(it.next());
        }
        // 預期結果[1, 2, 3, 4, 5]
        System.out.println("");
    }
}
