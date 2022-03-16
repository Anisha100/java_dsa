class Tree
{
   public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        
        while (!queue.isEmpty()){
                Node current = queue.poll();
                list.add(current.data);
                
                if (current.right != null)
                    queue.add(current.right);
                    
                if (current.left != null)
                    queue.add(current.left);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int len = list.size();
        for (int i =len-1; i>=0; i--){
            result.add(list.get(i));
        }
        return result;
    }
}
