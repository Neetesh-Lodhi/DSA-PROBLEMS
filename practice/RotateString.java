class RotateString{
          public boolean rotateString(String s, String goal) { //O(n)

        if(s.length() != goal.length()){
            return false;
        }
        String str = s+s;

        return str.contains(goal);
    }
}