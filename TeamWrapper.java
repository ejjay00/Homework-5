/**
 * @author Yashveer Singh
 * @version 1.0
 */
public class TeamWrapper {

    //ComparableCollection representing your main team
    private ComparableCollection<Character> team;

    //ComparableCollection representing your reserve team
    private ComparableCollection<Character> reserve;

    
    /**
    *Instantiates team and reserve ComparableCollections
    */
    public TeamWrapper() {
        team = new ComparableCollection<Character>();
        reserve = new ComparableCollection<Character>();
    }

    /**
     * Checks if there is space left on the main team. The main team can only have 
     * 10 fighters.
     * @return true if there is space left on the team, false otherwise
     */
    public boolean checkTeamCapacity() {
        //YOUR CODE HERE//
    }

    /**
     * Checks if there is space left in the reserve. The reserve can only have
     * 5 fighters.
     * @return true if there space left on the reserve team, false otherwise
     */
    public boolean checkReserveCapacity() {
        //YOUR CODE HERE
    }


    /**
     * add c to the main team if there is space and if c is not already on the
     * main team and if c is not already on the reserve team
     * @param c the character to be added
     */
    public void addToTeam(Character c) {
        //YOUR CODE HERE//
    }

    /**
     * add c to the reserve if there is space and if c is not already on the
     * reserve team and if c is not already on the main team
     * @param c the character to be added
     */
    public void addToReserve(Character c) {
        //YOUR CODE HERE//
    }


    /**
     * Removes a character from the main team.
     * @param c the character to be removed from the team
     * @return true if successfully removed, false otherwise
     */
    public boolean removeFromTeam(Character c) {
        //YOUR CODE HERE//
    }

    /**
     * Removes a character from the reserve team.
     * @param c the character to be removed from the reserve team
     * @return true if succesfully removed, false otherwise
     */
    public boolean removeFromReserve(Character c) {
        //YOUR CODE HERE//
    }


    /**
     * Removes c from the main team and adds c to the reserve if there is space on
     * the reserve. C must be succesfully removed from the main team before adding
     * to the reserve.
     * @param c
     * @return If c was succesfully moved to the reserve, return true, otherwise
     * return false.
     */
    public boolean moveToReserve(Character c) {
        //YOUR CODE HERE//
    }

    /**
     * Removes c from the reserve and adds c to the main team if there is space on
     * the main team. C must be successfully removed from the reserve before adding
     * to the main team.
     * @param c
     * @return If c was successfully moved to the main team, return true, otherwise
     * return false.
     */
    public boolean promoteToTeam(Character c) {
        //YOUR CODE HERE//
    }

    /**
     * gives the size of your current main team
     * @return the number of members on your main team
     */
    public int teamSize() {
        //YOUR CODE HERE//
    }


    /**
     * gives the size of your current reserve team
     * @return the number of members on your current reserve team
     */
    public int reserveSize() {
        //YOUR CODE HERE//
    }

    /**
     * gets the Character at specified index from your main team
     * @param index the index that you are getting the team member from
     * @return the Character at the index location on your main team
     */
    public Character getFromTeam(int index) {
        //YOUR CODE HERE//
    }

    /**
     * gets the Character at the specified index from your reserve
     * @param index the index that you are getting the reserve member from
     * @return the Character at the index location on your reserve team
     */
    public Character getFromReserve(int index) {
        //YOUR CODE HERE//
    }


    /**
     * DO NOT MODIFY.
     * @return a String including all of the characters on your main team
     */
    public String teamToString() {
        int i = 0;
        String toReturn = "Main Team\n\n";
        for(Character c : team) {
            if(c != null) {
                toReturn += i + ". " + c.toString() + "\n";
            }
            i++;
        }
        return toReturn;
    }

    /**
     * DO NOT MODIFY
     * @return a String representing all of the characters on your reserve team
     */
    public String reserveToString() {
        int i = 0;
        String toReturn = "Reserve\n\n";
        for(Character c : reserve) {
            if(c != null) {
                toReturn += i + ". " + c.toString() + "\n";
            }
            i++;
        }
        return toReturn;
    }

}
