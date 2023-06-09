public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if(myString.equals(myString.toUpperCase()))
            return true;
//        if(myString.equals(myString.toLowerCase()))
//            return true;
//        if(myString.charAt(0) == Character.toUpperCase(myString.charAt(0)) &&
//                myString.substring(1).equals(myString.substring(1).toLowerCase()))
//            return true;
        return false;
    }

}

