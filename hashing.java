import java.util.*;

public class hashing {
    public static void main(String[] args) {
        int[] array=new int[6];
        array= new int[]{2, 3, 1, 2, 2, 1};
        HashSet<Integer> hs=new HashSet<Integer>();
        for (int i=0;i<6;i++)
        {
            hs.add(array[i]);
        }
        System.out.println("length "+hs.size());







//        HashMap<Integer,Integer> Map=new HashMap<Integer,Integer>();
//        Map.put(9,8);
//        Map.put(3,5);
//        Map.put(8,5);
//        Map.put(2,6);
//        Map.put(9,21);
////        Map.getValue();
//        for(Map.Entry m : Map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//        System.out.println(m.getKey()+" "+m.getValue());
//        System.out.println(hm.getValue(9));
    }
}
