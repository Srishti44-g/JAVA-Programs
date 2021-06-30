public class Demo{
   static void print_permutations(String my_str,String my_ans){
      if (my_str.length() == 0){
         System.out.print(my_ans + " ");
         return;
      }
      boolean my_arr[] = new boolean[26];
      for (int i = 0; i < my_str.length(); i++){
         char ch = my_str.charAt(i);
         String remaining_str = my_str.substring(0, i) + my_str.substring(i + 1);
         if (my_arr[ch - 'a'] == false)
         print_permutations(remaining_str, my_ans + ch);
         my_arr[ch - 'a'] = true;
      }
   }
   public static void main(String[] args){
      String my_str = "hey";
      System.out.println("The permutation of the string are :");
      print_permutations(my_str, "");
   }
}
