import java.util.Random;
/**
 * This application generates a funny new phrase
 *
 * @author Kylah
 * @source code from Head First Java
 * @version June 21, 2026
 */
public class PhraseOMatic
{
     public static void main(String[]args)
     {
         //three lists of words to choose from to generate new phrase
         String[] wordList1 = {"bandwidth","protocol","kernel","action item","RPO","agnostic","opinionated","AI enabled","strongly typed","voice activated","haptically driven","extensible","reactive","agent based","functional"};
         
         String[] wordList2 = {"distributed ledger","microservices","severless","containerized","service oriented","cloud native","IoT","pub-sub","event driven",
             "asynchronous", "six sigma", "loosely coupled","network"};

         String[] wordList3 = {"UNIX","firewall","encryption","WAN","design","orientation","framework","library","perspective","DSL","REST API","repository","pipeline","serive mesh","architecture"};
         
         //get the length of each list for random number generator
         int list1 = wordList1.length;
         int list2 = wordList2.length;
         int list3 = wordList3.length;
         
         //generator random numbers
         Random randGen = new Random();
         int rand1 = randGen.nextInt(list1);
         int rand2 = randGen.nextInt(list2);
         int rand3 = randGen.nextInt(list3);
         
         // put phrase together
         String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
         
         //print phrase
         System.out.println("What we need is a " + phrase);
         
    }   
}
