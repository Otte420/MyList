package org.example.List;

public class List
{
    private Node head;
    private Node startNode;
    private Node currentNode;
    private int size;


    public List()
    {

    }

    public int get(int index)
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

    public void add(int i)
    {
        // Neuen Knoten setzen
        var newNode = new Node(i);

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
        public int Value;
        public Node next;

        public Node(int Value)
        {
            this.Value = Value;
            this.next = null;
        }
    }
}
