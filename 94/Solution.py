class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        aux = []
        self.order(root, aux)
        return aux

    def order(self, node, aux) -> None:
        if node is not None:
            self.order(node.left, aux)
            aux.append(node.val)
            self.order(node.right, aux)