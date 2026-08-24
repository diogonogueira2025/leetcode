class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        aux = head
        node_prev = None
        count = 1

        while aux is not None:
            if count <= n:
                count += 1
            else:
                if node_prev is None:
                    node_prev = head
                else:
                    node_prev = node_prev.next
            aux = aux.next
        if node_prev is None:
            head = head.next
        else:
            node_remove = node_prev.next
            node_prev.next = node_remove.next
        return head
