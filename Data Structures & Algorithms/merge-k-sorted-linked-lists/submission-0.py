# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        # Iterate through initial list checking the first element of each LL
        # When smallest is found, pop off head.
        if len(lists) == 0: return None;

        head = None
        small = 0
        for i in range(len(lists)):
            if not lists[i]: 
                continue
            if lists[i].val < lists[small].val: small = i
        
        head = ListNode(lists[small].val)
        lists[small] = lists[small].next

        curr = head
        while True:
            for i in range(len(lists)):
                if not lists[i]: 
                    continue
                if not lists[small]:
                    small = i
                elif lists[i].val < lists[small].val: small = i
            if lists[small]: 
                curr.next = ListNode(lists[small].val)
                curr = curr.next
                lists[small] = lists[small].next
            else:
                break

        return head
