package tree_data_structures;
//TNode1 Class
class TNode1 {
int data;
TNode1 left, right;

TNode1(int value) {
   data = value;
   left = right = null;
}
}
class Bst {
TNode1 root;

TNode1 createTNode(int data) {
   return new TNode1(data);
}

void insertTNode(int data) {
   TNode1 newTNode = createTNode(data);
   if (root == null) {
       root = newTNode;
   } else {
       TNode1 current = root;
       while (true) {
           if (data <= current.data) {
               if (current.left == null) {
                   current.left = newTNode;
                   break;
               } else {
                   current = current.left;
               }
           } else {
               if (current.right == null) {
                   current.right = newTNode;
                   break;
               } else {
                   current = current.right;
               }
           }
       }
   }
}

TNode1 searchTNode(int data) {
   TNode1 current = root;
   while (current != null) {
       if (data == current.data) {
           return current;
       } else if (data < current.data) {
           current = current.left;
       } else {
           current = current.right;
       }
   }
   return null;
}

// Traversal Methods
void inOrder(TNode1 node) {
   if (node != null) {
       inOrder(node.left);
       System.out.print(node.data + " ");
       inOrder(node.right);
   }
}

void preOrder(TNode1 node) {
   if (node != null) {
       System.out.print(node.data + " ");
       preOrder(node.left);
       preOrder(node.right);
   }
}

void postOrder(TNode1 node) {
   if (node != null) {
       postOrder(node.left);
       postOrder(node.right);
       System.out.print(node.data + " ");
   }
}

public static void main(String[] args) {
   Bst tree = new Bst();
   tree.insertTNode(50);
   tree.insertTNode(30);
   tree.insertTNode(20);
   tree.insertTNode(40);
   tree.insertTNode(70);
   tree.insertTNode(60);
   tree.insertTNode(80);

   System.out.println("In-order Traversal:");
   tree.inOrder(tree.root);
   System.out.println();

   System.out.println("Pre-order Traversal:");
   tree.preOrder(tree.root);
   System.out.println();

   System.out.println("Post-order Traversal:");
   tree.postOrder(tree.root);
   System.out.println();

   int searchData = 20;
   TNode1 searchResult = tree.searchTNode(searchData);
   if (searchResult != null) {
       System.out.println(searchData + " found in the binary tree.");
   } else {
       System.out.println(searchData + " not found in the binary tree.");
   }
}
}