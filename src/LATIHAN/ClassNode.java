package LATIHAN;
public class ClassNode {
    protected int data;
    protected ClassNode link;
    
    public ClassNode ()
    {
    link = null;
    data = 0;
    }
    
    public ClassNode(int d,ClassNode n)
    {
    data = d;
    link = n;
    }

    public void setLink(ClassNode n)
    {
    link = n;  
    }

    public void setData(int d)
    {
    data = d;
    }

    public ClassNode getLink()
    {
    return link;
    }

    public int getData()
    {
    return data;
    }
}
