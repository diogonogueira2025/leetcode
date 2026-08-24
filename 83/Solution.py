# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        current = head
        ptr = head
        while current is not None:
            if ptr.val != current.val:
                ptr.next = current
                ptr = current
            current = current.next
        ptr.next = None
        return head
        