/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
 
    int lenl1=0,lenl2=0;
ListNode  templ1=l1;
ListNode  templ2=l2;
    while(templ1 !=null || templ2!=null){
        if(templ1 !=null){
            lenl1++;
            templ1=templ1.next;
        }
          if(templ2 !=null){
            lenl2++;
            templ2=templ2.next;
        }
    }
        ListNode temp=null;
    if(lenl1<lenl2){
      temp=l1;
      l1=l2;
      l2=temp;
    }

   ListNode curr=l1;
    ListNode prev=null;
    int carry=0;
    

     while(curr!=null){
        if(l2!=null){
            if(carry+curr.val+l2.val>9){
                curr.val=(carry+curr.val+l2.val-10);
                carry=1;
            }
            else{
                curr.val=carry+(curr.val+l2.val);
                carry=0;
            }
             l2=l2.next;

        }
        else{
             if(carry+curr.val>9){
                curr.val=(carry+curr.val-10);
                carry=1;
            }
            else{
                curr.val=carry+(curr.val);
                carry=0;
            }
        }

             prev=curr;
         curr=curr.next;


      }

      if(carry>0){
          ListNode node=new ListNode(carry);
          prev.next=node;
      }
      return l1;
        
    }
}