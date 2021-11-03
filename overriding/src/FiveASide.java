public class FiveASide extends  Sports{

    @Override
    String getName(){
        return "Five A Side";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 5 players in " + getName());
    }

}
