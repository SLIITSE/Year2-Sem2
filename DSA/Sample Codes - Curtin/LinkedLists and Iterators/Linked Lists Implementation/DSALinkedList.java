class DSALinkedList
{
    DSAListNode head;
    DSAListNode tail;

    public DSALinkedList()
    {
        head = null;
        tail = null;
    }

    public void insertFirst(Object newValue)
    {
        DSAListNode newNode = new DSAListNode(newValue);
        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertLast(Object newValue)
    {
        DSAListNode currNode;
        DSAListNode newNode = new DSAListNode(newValue);
        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            currNode = head;
            while (currNode.getNext() != null)
            {
                currNode = currNode.getNext();
            }
            tail = newNode;
            currNode.setNext(newNode);
            newNode.setPrev(currNode);
        }
    }

    public boolean isEmpty()
    {
        boolean returnVal;
        if (head == null)
        {
            returnVal = true;
        }
        else
        {
            returnVal = false;
        }
        return returnVal;
    }

    public Object peekFirst()
    {
        Object returnVal = null;
        if (isEmpty() == false)
        {
            returnVal = head.getValue();
        }
        return returnVal;
    }
    public Object peekLast()
    {
        DSAListNode currNode;
        Object returnVal = null;
        if (isEmpty() == false)
        {
            returnVal = tail.getValue();
        }
        return returnVal;
    }

    public Object removeFirst() throws Exception
    {
        Object nodeValue = null;
        if (isEmpty() == false)
        {
            nodeValue = head.getValue();
            head = head.getNext();
        }
        else 
        {
            throw new Exception("No more items!");
        }
        return nodeValue;
    }

    public Object removeLast()
    {
        Object nodeValue = null;
        DSAListNode currNode;
        DSAListNode prevNode;
        if (isEmpty() == false)
        {
            if (head.getNext() == null)
            {
                nodeValue = head.getValue();
                head = null;
                tail = null;
            }
            else
            {
                prevNode = null;
                currNode = head;
                while (currNode.getNext() != null )
                {
                    prevNode = currNode;
                    currNode = currNode.getNext();
                }
                tail = prevNode;
                prevNode.setNext(null);
                nodeValue = currNode.getValue();
            }
        }
        return nodeValue;
    }
}