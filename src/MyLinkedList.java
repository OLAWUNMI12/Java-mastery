public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
                if(comparison < 0){
                    if(currentItem.next() != null){
                        currentItem = currentItem.next();
                    }
                    else {
                        currentItem.setNext(item);
                        item.setPrevious(currentItem);
                        return true;
                    }

                }else if (comparison > 0){
                    if(currentItem.previous() != null){
                        currentItem.previous().setNext(item);
                        item.setPrevious(currentItem.previous());
                        item.setNext(currentItem);
                        currentItem.setPrevious(item);
                    }else {
                        item.setNext(this.root);
                        this.root.setPrevious(item);
                        this.root = item;
                    }
                    return true;
                }else {
                    return false;
                }

         }
        return  false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){

        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                if(this.root.next() == currentItem){
                    this.root = this.root.next();
                }else {
                    currentItem.previous().setPrevious(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if (comparison < 0){
                currentItem = currentItem.next();
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        }else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
