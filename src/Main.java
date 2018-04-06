/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Main 
{
    public static void main(String[] args) 
    {
       // The main method
    Scoreboard highscores = new Scoreboard(5);
    String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};
    int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};


    for (int i=0; i < names.length; i++) 
    {
      GameEntry gE = new GameEntry(names[i], scores[i]);
      System.out.println("Adding " + gE);
      highscores.add(gE);
      System.out.println(" Scoreboard: " + highscores);
    }
    System.out.println("Removing score at index " + 3);
    highscores.remove(3);
    System.out.println(highscores);
    System.out.println("Removing score at index " + 0);
    highscores.remove(0);
    System.out.println(highscores);
    System.out.println("Removing score at index " + 1);
    highscores.remove(1);
    System.out.println(highscores);
    System.out.println("Removing score at index " + 1);
    highscores.remove(1);
    System.out.println(highscores);
    System.out.println("Removing score at index " + 0);
    highscores.remove(0);
    System.out.println(highscores);
  }
}


//
//public void add(GameEntry e) 
//{
//    int newScore = e.getScore(); 
//    SinglyLinkedList<GameEntry> temp = new SinglyLinkedList();
//
//    if( numEntries < maxEnter  || newScore > objLink.last().getScore())
//    {                   
//        if(numEntries < maxEnter)
//            numEntries++;
//
//        // what if it is max and you want to input the biggest score in the front?
//        // is that mean you have to remove the last number. 
//        
//        if( objLink.isEmpty() || newScore > objLink.first().getScore())
//            objLink.addFirst(e);
//
//        else
//        {   
//            GameEntry current = objLink.first();  
//
//            while(current != null)
//            {
//                if(newScore > current.getScore())
//                {
//                    temp.addLast(e);
//                    objLink.addFirst(e);
//                    current = null; 
//                }
//                else
//                {
//                    temp.addLast(objLink.first());
//                    objLink.removeFirst();
//                    current = objLink.first();
//                }
//            }
//        }
//        if(!temp.isEmpty())
//        {
//            if(newScore != temp.last().getScore())
//            {
//                temp.addLast(e);
//            }
//            //objLink.concatenate(temp);
//            //temp.concatenate(objLink);
//            objLink = temp; 
//        }
//    }
//}
//
//    //create temp
//    // numEntries = i for an array
//    // objeLink. to first is element and .getScore() is first element in link get data inside. 
//    // you need to keep updates top 10; get the highest, and keep updates
//
////  /** Remove and return the high score at index i. */
//public  SinglyLinkedList<GameEntry> remove(int i) throws IndexOutOfBoundsException
//{
//    SinglyLinkedList<GameEntry> temp = new SinglyLinkedList();
//    GameEntry current = objLink.first();
//    
//    if (i < 0 || i >= numEntries)
//        throw new IndexOutOfBoundsException("Invalid index: " + i);
//
//    if(i == 0)
//        objLink.removeFirst();
//    else if(i == maxEnter)
//    {
//        while(current != null)
//        {
//            temp.addLast(current);
//            objLink.removeFirst();
//            current = objLink.first();
//        }
//        objLink.removeFirst();
//        objLink = temp; 
//    }
//    else
//    {
//        int counter = 0; 
//     
//        while(counter < i)
//        {
//            temp.addLast(current);
//            objLink.removeFirst();
//            current = objLink.first();
//
//            counter++;
//         }
//        temp.concatenate(objLink);
//        objLink = temp; 
//    }
//    
//    return objLink;
//}