# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists:
            return None
        heap = []

        for i in lists:
            curr = i
            while curr:
                heap.append(curr.val)
                curr = curr.next
        
        heapq.heapify(heap)
        res = []
        while len(heap) > 0:
            res.append(heapq.heappop(heap))
       
        ans = ListNode()
        curr = ans
        for i in range(len(res)):
            curr.next = ListNode(res[i])
            curr = curr.next

        return ans.next
