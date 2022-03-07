class Solution{
static ArrayList <Integer> levelOrder(Node node) 
   {
       // Your code here
       ArrayList<Integer> result = new ArrayList<>();
       if(node == null) return result;
       
       Queue<Node> q = new LinkedList<>();
       q.add(node);
       while(!q.isEmpty()){
           Node cur = q.poll();
           result.add(cur.data);
           if(cur.left != null)
               q.add(cur.left);
           if(cur.right != null)
               q.add(cur.right);
       }
       return result;
   }
   }
