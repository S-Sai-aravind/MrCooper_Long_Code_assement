import java.security.Timestamp;
import java.util.*;
class Voter{
    private int voterid;
    private String name;
    private int age;
    private char hasVoted;
    VotingSystem v= new VotingSystem();
    //private ArrayList<Integer> VoterList=new ArrayList<>();
    public void setVoter(int id,String name,int age){
        if(authenticate(id,age)){
            this.voterid=id;
            this.name=name;
            this.age=age;
            this.hasVoted='N';
            v.Voters.add(this);
        }
        else{
            System.out.print(" Your not eligible to vote");
        }
    }
    public void getdetails(int id){
        System.out.println("Id:"+this.voterid);
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
    }
    public boolean authenticate(int id,int age){
        ArrayList a=v.Voters;
        if((age<18) || (a.contains(id))){
            return false;
        }
        return true;

    }
    public void castVote(int id){
        if(this.getstatus(id)=='N'){
            candidate c=new candidate();
            c.incrementVote(id);
            this.hasVoted='Y';
        }
        else{
            System.err.println("You already voted");
        }
    }
    public char getstatus(int id){
        return this.hasVoted;
    }
}
class candidate{
    private int candidateId;
    private String name;
    private String party;
    private int voteCount;
    public void incrementVote(int id){
        this.voteCount+=1;
    }
    public void setDetails(int id,String name,String party){
        this.candidateId=id;
        this.name=name;
        this.party=party;
        this.voteCount=0;
    }
    public void getdetails(int id){
        System.out.println("Id:"+this.candidateId);
        System.out.println("name:"+this.name);
        System.out.println("Party:"+this.party);
    }
    public int getcount(){
        return this.voteCount;
    }
}
class Election extends candidate{
    private int electionid;
    private String[] title;
    private Date starDate;
    private Date endDate;
    private int status;
    ArrayList<Integer> cList= new ArrayList<>();
    public void addcandidate(int id,String name,String party){
        candidate c=new candidate();
        super.setDetails(id, name, party);
        cList.add(c);
    }
    public void setDetails(int id,String[] name,Date sd,Date ed){
        this.electionid=id;
        this.title=name;
        this.starDate=sd;
        this.endDate=ed;
    }
    public void closeElection(int id){
        this.status=0;
    }
    public int declareResult(){
        int max=0;
        int id=0;
        for(candidate i:cList){
            if(max<c.getcount()){
                max=c.candidateId;
                id=i;
            }
        }
        return id;
    }
}
class VoteRecord{
    private int recordId;
    private int voterId;
    private int electionId;
    private Timestamp timestamp;
    public boolean validate(){
        return true;
    }
    public void save(){

    }
    
}
public class VotingSystem{
    ArrayList<Election> elections=new ArrayList<>();
    ArrayList<Voter> Voters=new ArrayList<>();
    public static void main(String[] args) {
        Voter vote=new Voter();
        Election elect=new Election();
        System.out.print("Enter value:");
        Scanner sc=new Scanner(System.in);
        while (true) {
            int i=sc.nextInt();
            if(i==1){
            int id= sc.nextInt();
            String a= sc.next();
            int age=sc.nextInt();
            vote.setVoter(id, a, age);
            vote.getdetails(id);
            }
            else if(i==2){
                int id= sc.nextInt();
                String b= sc.next();
                String c=sc.next();
                elect.addcandidate(id, b, c);
                elect.getdetails(id);
            }
            else if(i==3){
                int id=sc.nextInt();
                vote.castVote(id);
            }
            else if(i==4){
                System.out.println(elect.declareResult());
            }
            else{
                break;
            }
        }


}

}
