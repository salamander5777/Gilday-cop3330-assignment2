package ex25;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void passwordValidator() {
        int l = 8;
        char[] arrays1 = "1337h@xor!".toCharArray();
        int Alphabet = 0; //Establishing a base value for Alphabetical characters.
        int Num = 0; //Establishing a base value for Numerical characters.
        int Spe = 0; //Establishing a base value for Special characters.

        if(l < 8){
            for(int i = 0; i < l; i++){
                if(Character.isDigit(arrays1[i])){
                    Num = 1;
                }
                else if(Character.isLetter(arrays1[i])){
                    Alphabet = 2;
                }
                else if(!Character.toString(arrays1[i]).matches("[0-9]") || !Character.toString(arrays1[i]).matches("[A-Z]") || Character.toString(arrays1[i]).matches("[a-z]")){
                    Num = 1;
                }
            }
            System.out.print(Num + Alphabet);
        }
        else{
            for(int i = 0; i < l; i++){
                if(Character.isDigit(arrays1[i])){
                    Num = 1;
                }
                else if(Character.isLetter(arrays1[i])){
                    Alphabet = 2;
                }
                else if(!Character.toString(arrays1[i]).matches("[0-9]") || !Character.toString(arrays1[i]).matches("[A-Z]") || Character.toString(arrays1[i]).matches("[a-z]")){
                    Spe = 1;
                }
            }

            int MetRules = Num+ Alphabet + Spe +1;
            System.out.print(MetRules == 1 ? "The password is a very weak password." : MetRules == 2 ? "The password is a weak password." : MetRules == 3 ? "The password is an average password." : MetRules == 4 ? "The password is a strong password." : "The password is a very strong password.");
        }
    }
}