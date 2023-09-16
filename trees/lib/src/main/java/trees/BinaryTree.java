package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public List<Integer> preOrder(Node current) {
        List<Integer> list = new ArrayList<>();
        preOrderMethod(current, list);
        return list;
    }
    public void preOrderMethod(Node current,List list){
        if(current==null)
         return;
     list.add((current.data));
//        System.out.println(list);
        preOrderMethod(current.left,list);
        preOrderMethod(current.right,list);
    }

    public List<Integer> inOrder(Node current) {
        List<Integer> list = new ArrayList<>();
        inOrderMethod(current, list);
        return list;
    }
    public void inOrderMethod(Node current,List list){
        if(current==null)
            return;
        inOrderMethod(current.left,list);
        list.add(current.data);
//        System.out.println(current.data);
        inOrderMethod(current.right, list);


    }

    public List<Integer> postOrder(Node current) {
        List<Integer> list = new ArrayList<>();
        postOrderMethod(current, list);
        return list;
    }

    public void postOrderMethod(Node current,List list){
        if(current==null)
            return;
        postOrderMethod(current.left,list);
        postOrderMethod(current.right,list);
   list.add(current.data);
//   System.out.println(current.data);


    }

}
