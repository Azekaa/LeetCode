package EASY;

public class Task16 {
    public static void main(String[] args){
        ListNode listNode = new ListNode(1,new ListNode(1,new ListNode(2, new ListNode(2))));
        ListNode result =  deleteDuplicates(listNode);
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
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode news = head;
        if (head == null) return null;

        while (news.next != null){
            if (news.val != news.next.val){
                news = news.next;
            }
            else news.next = news.next.next;

        }
        return head;
    }
}
