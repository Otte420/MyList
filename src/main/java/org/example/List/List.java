package org.example.List;

public class List<T>
{
    private Node head;
    private Node startNode;
    private Node currentNode;
    private int size;


    public List()
    {

    }

    public T get(int index)
    {
        if(index >= size)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        var node = startNode;

        for(int i = 0; i < index; i++)
        {
            node = node.next;
            if(node == null)
            {
                throw new ArrayIndexOutOfBoundsException("zu weit");
            }
        }

        return node.Value;
    }

    public int size()
    {
        return size;
    }

    public void add(T Value)
    {
        // Neuen Knoten setzen
        var newNode = new Node(Value);

        // Startknoten setzen(nur beim erstem Element)
        if(startNode == null)
        {
            startNode = newNode;
        }

        // Next des alten Knoten aktualisieren
        if(currentNode != null)
        {
            currentNode.next = newNode;
        }
        currentNode = newNode;
        size++;
    }

    public void remove(Integer i)
    {

    }

    class Node{
        T Value;
        public Node next;

        public Node(T Value)
        {
            this.Value = Value;
            this.next = null;
        }
    }
}
