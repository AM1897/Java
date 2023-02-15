public class Main {
    public static void main(String[] args) {

        //En lärare som granskar elevuppgifter och vill hoppa över en elevs
        //Svar för att gå vidare till nästa. Här kan break användas för
        //att avsluta loopen och continue användas för att hoppa över en Specifik iteration

        //om eleven skrivit OK, skriv ut namnet
        //om elven inte skrivit OK, hoppa över namnet

        String[] elevNamn = {"Harry Potter", "Hermione Granger", "Ron Weasley", "Luna Lovegood", "Draco Malfoy",
                "Neville Longbottom", "Ginny Weasley", "Fred Weasley", "George Weasley", "Cho Chang"};
        String[] elvSvar = {"OK", "OK", "OK", "OK", "", "OK", "", "OK", "", "OK"};


        for (int i = 0; i < elevNamn.length; i++) {
            if (elvSvar[i].equals("")) {
                System.out.println("Hoppa över " + elevNamn[i]);
                continue;
            }
            System.out.println("Granskar " + elvSvar[i]);
        }

    }
}