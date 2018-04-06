
public class Scoreboard 
{
    private int numEntries = 0;              // number of actual entries
    private SinglyLinkedList<GameEntry> objLink = new SinglyLinkedList();
  
    private int maxEnter = 0;
    // hellokdldsfkgl;ksd;g;ldfgdfgsdfgglkdsf;glskdf;gsdf;lgks;dl
public Scoreboard(int capacity) // skdfgjlksdfjgsdg
{
    maxEnter = capacity;
    // HLEllo
    
}

//create temp
// numEntries = i for an array
// objeLink. to first is element and .getScore() is first element in link get data inside. 
// you need to keep updates top 10; get the highest, and keep updates.


public void add(GameEntry e) 
{

    if(objLink.isEmpty())
       objLink.addFirst(e);
    else
    {
        int newScore = e.getScore(); 
        SinglyLinkedList<GameEntry> temp = new SinglyLinkedList();
        GameEntry current = objLink.first();

        if( numEntries < maxEnter  || newScore > objLink.last().getScore())
        {                   
            while(current != null)
            {
                if(newScore > current.getScore())
                {
                    temp.addLast(e);
                    
                    if(numEntries == maxEnter)
                    {
                        while(current != objLink.last())
                        {
                            temp.addLast(objLink.first());
                            objLink.removeFirst();
                            current = objLink.first();
                        }
                        objLink.removeFirst();
                    }
                    current = null; 
                }
                else
                {
                    temp.addLast(objLink.first());
                    objLink.removeFirst();
                    current = objLink.first();  
                }
            }            
            if( numEntries != maxEnter && objLink.isEmpty())
                objLink.addFirst(e); 

            temp.concatenate(objLink);
            objLink = temp; 
        }     
    }                
    if(numEntries < maxEnter)
        numEntries++;
}

//  /** Remove and return the high score at index i. */
public  SinglyLinkedList<GameEntry> remove(int i) throws IndexOutOfBoundsException
{
    SinglyLinkedList<GameEntry> temp = new SinglyLinkedList();
    GameEntry current = objLink.first();
    
    if (i < 0 || i >= numEntries)
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    else
    {
        if(i == 0)
            objLink.removeFirst();
        else if(i == maxEnter)
        {
            while(current != null)
            {
                temp.addLast(current);
                objLink.removeFirst();
                current = objLink.first();
            }
            objLink.removeFirst();
            objLink = temp; 
        }
        else
        {  
            for(int j = 0; j < i; ++j)
            {
                temp.addLast(current);
                objLink.removeFirst();
                current = objLink.first();
             }
            objLink.removeFirst();
            temp.concatenate(objLink);
            objLink = temp; 
        }
    }
    return objLink;
}

  /** Returns a string representation of the high scores list. */
public String toString() 
{
    StringBuilder sb = new StringBuilder("[");
    
    sb.append(objLink);
    sb.append("]");
    
    return sb.toString();
}
}