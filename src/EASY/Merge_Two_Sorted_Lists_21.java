package EASY;

public class Merge_Two_Sorted_Lists_21 {
    public static void main(String[] args){
        ListNode list1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));


        ListNode list2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));

        Merge_Two_Sorted_Lists_21 obj = new Merge_Two_Sorted_Lists_21();

        ListNode result = obj.mergeTwoLists(list1, list2);

        // вывод результата
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode list = ans;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                list.next = list1;
                list1 = list1.next;
            }
            else {
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
        }
        if(list1 == null){
            list.next = list2;
        }
        else {
            list.next = list1;
        }
        return ans.next;
    }
}
